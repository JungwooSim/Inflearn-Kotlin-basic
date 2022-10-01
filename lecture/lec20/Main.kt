package lecture.lec20

import lecture.lec19.Person

fun main() {

}

/**
 * 1. scope function 이란 무엇인가?
 * - scope function : 일시적인 영역을 형성하는 함
 * - 람다를 사용해 일시적인 영역을 만들고 코드를 더 간결하게 만들거나, method chaning 에 활용하는 함수를 scope function 이라고 한다.
 */
fun printPerson(person: Person?) {
    // let : scope function 의 한 종류
    person?.let {
        println(it.name)
        println(it.age)
    }
}

/**
 * 2. scope function 의 분류
 * - let : 람다의 결과를 반환, it 사용
 * - run : 람다의 결과를 반환, this 사용
 * - also : 객체 그 자체를 반환, it 사용
 * - apply : 객체 그 자체를 반환, this 사용
 * - with
 *
 * this : 생략이 가능한 대신, 다른 이름을 붙일 수 없다.
 * it : 생략이 불가능한 대신, 다른 이름을 붙일 수 있다.
 */

/**
 * 3. 언제 어떤 scope function 을 사용해야 할까?
 */

// let
fun letTest() {

    // Ex1.
    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let {lengths -> println(lengths) }

    // Ex2
    // non-null 값에 대해서만 code block 을 실행시킬 때
    val str: String? = "abcd"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    // Ex3
    // 일회성으로 제한된 영역에 지역 변수를 만들 때
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "$firstItem"
        }.uppercase()

    println(modifiedFirstItem)
}

// run - 객체 초기화와 반환 값의 계산을 동시에 해야 할 때
fun runTest() {
    // 객체를 만들어 DB 에 저장하고, 그 인스턴스를 활용할
    //val person = Person("big", 100).run {personRepository::save}
}

// apply - 객체 설정을 할 때, 객체를 수정하는 로직이 call chain 중간에 필요할 때
fun createPerson(
    name: String,
    age: Int
): Person {
    return Person(
        name = name,
        age = 10
    ).apply {
        this.age = age
    }
}

// also - 객체를 수정하는 로직이 call chain 중간에 필요할 때
fun alsoTest() {
    mutableListOf("one", "two", "three")
        .also { println("The list elements before adding new one: $it") }
        .add("fore")
}

// with - 특정 객체를 다른 객체로 변환해야 할 때, 모듈 간의 의존성에 의해 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때
// this 를 생략할 수 있어 필드가 많아도 코드가 간결해진다
//fun withTest() {
//    return with(person) {
//        PersonDto(
//            name = name,
//            age = age
//        )
//    }
//}
