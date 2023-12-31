package diexample

import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.cast
import org.reflections.Reflections

class DI
fun main() {
  // V1
//  ContainerV1.register(AService::class)
//  val aService = ContainerV1.getInstance(AService::class)
//  aService.print()

  // V2
//  ContainerV2.register(AService::class)
//  ContainerV2.register(BService::class)
//
//  val bService = ContainerV2.getInstance(BService::class)
//  bService.print()

  // reflections 라이브러리를 활용하여 Annotation 으로 의존성 주입
  start(DI::class)

  val bService = ContainerV2.getInstance(BService::class)
  bService.print()

}

fun start(clazz: KClass<*>) {
  val reflections = Reflections(clazz.packageName)
  val jClasses = reflections.getTypesAnnotatedWith(MyClass::class.java)
  jClasses.forEach { jClass -> ContainerV2.register(jClass.kotlin) }
}

private val KClass<*>.packageName: String
  get() {
    val qualifiedName = this.qualifiedName
      ?: throw IllegalArgumentException("익명 객체!")

    val hierarchy = qualifiedName.split(".")
    return hierarchy.subList(0, hierarchy.lastIndex).joinToString(".")
  }

annotation class MyClass

object ContainerV2 {

  private val registeredClasses = mutableListOf<KClass<*>>()
  private val cachedInstances = mutableMapOf<KClass<*>, Any>()

  fun register(clazz: KClass<*>) {
    registeredClasses.add(clazz)
  }

  fun <T : Any> getInstance(type: KClass<T>): T {
    if (type in cachedInstances) {
      return type.cast(cachedInstances[type])
    }

    val instance = registeredClasses.firstOrNull { clazz -> clazz == type }
      ?.let { clazz -> instantiate(clazz) as T }
      ?: throw IllegalArgumentException("해당 인스턴스를 찾을 수 없습니다.")

    cachedInstances[type] = instance

    return instance
  }

  private fun <T : Any> instantiate(clazz: KClass<T>): T {
    val constructor = findUsableConstructor(clazz)
    val params = constructor.parameters
      .map { param -> getInstance(param.type.classifier as KClass<*>) }
      .toTypedArray()

    return constructor.call(*params)
  }

  // clazz 의 constructor 들 중, 사용할 수 있는 constructor
  // constructor 에 넣어야 하는 타입들이 모두 등록된 경우 (컨테이너에서 관리하고 있는 경우)
  private fun <T : Any> findUsableConstructor(clazz: KClass<T>): KFunction<T> {
    return clazz.constructors.firstOrNull { constructor -> constructor.parameters.isAllRegistered }
      ?: throw IllegalArgumentException("사용할 수 있는 생성자가 없습니다.")
  }

  private val List<KParameter>.isAllRegistered: Boolean
    get() = this.all { it.type.classifier in registeredClasses }
}

object ContainerV1 {

  private val registeredClasses = mutableListOf<KClass<*>>()

  fun register(clazz: KClass<*>) {
    registeredClasses.add(clazz)
  }

  fun <T : Any> getInstance(type: KClass<T>): T {
    return registeredClasses.firstOrNull { clazz -> clazz == type }
      ?.let { clazz -> clazz.constructors.first().call() as T }
      ?: throw IllegalArgumentException("해당 인스턴스를 찾을 수 없습니다.")
  }
}

@MyClass
class AService {
  fun print() {
    println("A Service 입니다")
  }
}

@MyClass
class BService(
  private val aService: AService,
) {
  fun print() {
    this.aService.print()
  }
}