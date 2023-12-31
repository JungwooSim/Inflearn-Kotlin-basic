import kotlin.reflect.KFunction
import kotlin.reflect.full.createType
import kotlin.reflect.full.hasAnnotation


fun main() {
  executeAll(Reflection())
}

annotation class Executable

@Executable
class Reflection {
  fun a() {
    println("A 입니다")
  }

  fun b(a: Int) {
    println("B 입니다")
  }

}

fun executeAll(obj: Any) {
  val kClass = obj::class
  if (!kClass.hasAnnotation<Executable>()) {
    return
  }

  val callableFunction = kClass.members.filterIsInstance<KFunction<*>>()
    .filter { it.returnType == Unit::class.createType() }
    .filter { it.parameters.size == 1 && it.parameters[0].type == kClass.createType() }

  callableFunction.forEach { function ->
    function.call(obj)
  }
}