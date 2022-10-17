package study.lec09.ko

import java.lang.IllegalArgumentException

fun main() {
    val person1 = Person("big1", 100)
    val person2 = Person("big2", 100)

    println(person2.name)
    person2.age = 10
    println(person2.age)
}

class Person(
    name: String,
    var age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없다")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫 번째 생성자")
    }

    constructor() : this("홍길동") {
        println("두 번째 생성자")
    }

    val isAdult: Boolean
        get() = this.age >= 20

    val name: String = name
        get() = field.uppercase()
}