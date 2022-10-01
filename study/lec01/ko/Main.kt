package study.lec01.ko

import study.lec01.Person

fun main() {
    var number1: Long // 값 할당없이 초기화
    number1 = 10
    println(number1)

    val number2: Long = 20 // 값 할당하며 초기화
    val number3 = 20 // 값 할당하며 초기화 (Type 작성 안해도 됨)

    var number4: Long? = null

    var person = Person("big")
}