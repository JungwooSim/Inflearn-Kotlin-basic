package study.lec15.ko

fun main() {
    val array = arrayOf(100, 200)
    array.plus(300)

    for ((idx, value) in array.withIndex()) {
        println("${idx} ${value}")
    }

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    //

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }

    //

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}