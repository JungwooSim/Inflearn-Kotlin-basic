package lecture.lec09

fun main() {
//    val person1 = Person("홍길동", 0)
    val person2 = Person2("홍길동", 100)
    val person3 = Person2("홍길동")

    // getter
    println(person2.name)

    // setter
    person2.age = 10
    println(person2.age)

}

/**
 * 1. 클래스와 프로퍼티
 * Getter, Setter 은 자동으로 생성됨
 *
 * 2. 생성자와 init
 * init {} 은 최초로 한번 불러옴
 * 코틀린에서는 default parameter 를 선호!
 * 거의 부생성자는 사용하지 않음
 */
class Person constructor(name: String, age: Int) {
    val name: String = name
    var age: Int = age

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    constructor(name: String): this(name, 1)
}

class Person2(val name: String, var age: Int) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }

        println("초기화 블럭")
    }

    // 부생성자(secondary constructor)
    // 최종적으로 주생성자를 this 로 호출한다.
    // body 를 가질 수 있다
    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor(): this(name = "홍길동") {
        println("두 번째 번째 부생성자")
    }

    /**
     * 3. 커스텀 getter, setter
     * getter 의 자동생성을 막기 위해서는 생성자에 val 또는 var 을 생략해야 함.
     */
    val isAdult: Boolean
        get() = this.age >= 20

    val isAdult2: Boolean
        get() {
            return this.age >= 20
        }
}

class Person4(name: String = "홍길동", var age: Int = 1) {

    // custom setter
    var name = name
        set(value) {
            field = value.uppercase()
        }
}

/**
 * 4. backing field
 * field 라는 예약어를 사용하여 자기 자신을 가리킨다. (많이 사용하지는 않음)
 */
class Person3(
    name: String,
    var age: Int
) {
    val name: String = name
        get() = field.uppercase()

    fun getUppercaseName(): String {
        return this.name.uppercase()
    }

    val uppercaseName2: String
        get() = this.name.uppercase()

}
