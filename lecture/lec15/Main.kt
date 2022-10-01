package lecture.lec15

/**
 * 정리
 * - 코틀린에서는 컬렉션을 만들 때도 불변/가변을 지정해야 한다.
 * - List, Set, Map 에 대한 사용법이 변경, 확장되었다.
 * - Java 와 Kotlin 코드를 섞어 컬렉션을 사용할 때에는 주의해야 한다.
 *  - Java 에서 Kotlin 컬렉션을 가져갈 때는 불변 컬렉션을 수정할 수도 있고, non-nullable 컬렉션에 null 을 넣을 수도 있다.
 *  - Kotlin 에서 Java 컬렉션을 가져갈 때는 플랫폼타입을 주의해야 한다.
 */
fun main() {
    /**
     * 1. 배열
     */
    var array = arrayOf(100, 200)
    array = array.plus(300) // add element

    for (i in array.indices) {
        println("${i} : ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("${idx} : ${value}")
    }

    /**
     * 2. Collection
     * - 컬렉션을 생성할 때 불변인지, 가변인지 설정 해야 한다.
     * - List, MutableList
     * - Set, MutableSet
     * - Map, MutableMap
     *
     * 불변 컬렉션이라 하더라도 Reference Type 인 Element 의 필드는 바꿀 수 있다.
     */
    val numbers = listOf(100, 200) // 불변
    val mutableNumbers = mutableListOf(100, 200) // 가변

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} : ${value}")
    }

    val set = setOf(100L)
    val mutableSet = mutableSetOf(100L)

    val map = mapOf<Int, String>(1 to "one", 2 to "two")
    val mutableMap = mutableMapOf<Int, String>()
    mutableMap[1] = "one"
    mutableMap[2] = "two"

    for (key in mutableMap.keys) {
        println("${key} : ${mutableMap[key]}")
    }

    for ((key, value) in mutableMap.entries) {
        println("${key} : ${mutableMap[key]}")
    }

    /**
     * 3. 컬렉션의 null 가능성, Java 와 함께 사용하기
     */

}