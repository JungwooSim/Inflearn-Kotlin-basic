package study.lec06.ko

fun main() {

}

fun ex1() {
    val numbers = listOf<Long>(1, 2, 3)

    for (number in numbers) {
        println(number)
    }
}

fun ex2() {
    for (i in 1..3) {
        println(i)
    }
}

fun ex3() {
    for (i in 3 downTo 1) {
        println(i)
    }
}

fun ex4() {
    for (i in 1..5 step 2) {
        println(i)
    }
}

fun ex5() {
    var i = 1

    while (i <= 3) {
        println(i)
        i++
    }
}