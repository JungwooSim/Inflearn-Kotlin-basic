package lec19

import lec18.Fruit

data class Person(
    val name: String,
    val age: Int
)

fun main() {


    /**
     * 2. 구조분해와 componentN 함수
     * - data class 는 자동으로 componentN 이 만들어진다.
     */
    val person = Person("최태현", 100)
    val (name, age) = person // 여기!
    val name2 = person.component1()
    val age2 = person.component2()

    println("이름 : ${name}, 나이 : ${age}")

    /**
     * 3. Jump 와 Label
     * - return, break, continue
     */

    /**
     * 4. Takelf 와 TakeUnless
     */
}

/**
 * Type Alias 와 as import
 */
typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruit: List<Fruit>, filter: FruitFilter) {

}

/**
 * 4. Takelf 와 TakeUnless
 * 주어진 만족을 만족하면 그 값이, 그렇지 않으면 null 반환
 */
fun getNumberOrNull(number: Int): Int? {
    return number.takeIf { it > 0 }
}

