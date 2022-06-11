package lec03

import lec01.Person

fun main() {
    /**
     * 1. 기본타입
     * Byte, Short, Int, Long, Float, Double, 부호 없는 정수들
     * 코틀린은 선언된 기본값을 보고 타입을 추론한다.
     */
    val number1 = 3
    val number2: Long = number1.toLong() // toLong() 함수를 통해 타입 변경 가능

    val number3: Int? = 3
    val number4: Long = number1?.toLong() ?: 0L // null able 변수인 경우

    /**
     * Kotlin 의 3가지 특이한 타입
     * Any, Unit, Nothing
     *
     * Any 란?
     * Java 의 Object 역할 (모든 객체의 최상위 타입)
     * 모든 Primitive Type 의 최상의 타입도 Any 이다
     * Any 자체로는 null 을 포함할 수 없다. null 을 포함하고 싶다면 Any? 로 표현해야 한다
     * Any 에 equals, hashcode, toString 가 있다
     *
     * Unit 란?
     * Java 의 Void 와 동일한 역할
     * void 와 다르게 Unit 은 그 자체로 타입 인자로 사용 가능
     * 함수형 프로그래밍에서 Unit 은 단 하나의 인스턴스만 갖는 타입을 의미 (즉, 코틀린의 Unit 은 실제 존재하는 타입이라는 것을 표현)
     *
     * Nothing 란?
     * Nothing 은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
     * 무조건 예외를 반환하는 함수 / 무한 루프 함수
     */

    /**
     * String interpolation / String indexing
     */
    val person = Person("홍길동")
    println("이름 : ${person.name}")

    val str = """
        adf
        adf
        ${person.name}
    """.trimIndent()
    println(str)

    val str2 = "ABC"
    println(str2[0])
    println(str2[1])
    println(str2[2])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) { // java 에서 "obj instanceof Person" 과 동일
        println(obj.name) // is 를 통해 Person 을 확인했다면 object 캐스팅은 자동
    }

    if (obj !is Person) { // java 에서 "!(obj instanceof Person)" 과 동일
        val person = obj as Person // java 에서 "(Person) obj" 과 동일
        println(person)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person // as? 는 null 일수도 있고 person 일수도 있는 것을 의미
    println(person?.name) // safe call
}