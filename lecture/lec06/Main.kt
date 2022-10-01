package lecture.lec06

fun main() {
    /**
     * 1. for-each
     */
    val numbers = listOf(1L, 2L, 3L)

    for (number in numbers) {
        println(number)
    }

    /**
     * 2. 전통적인 for
     */
    for (i in 1..3) {
        println(i)
    }

    /**
     * 3. Progression 과 Range
     */
    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    /**
     * 4. while
     */
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}