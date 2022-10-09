package study.lec08.ko

fun main() {
    repeat(str = "Hello World", num = 3, useNewLine = false)
    repeat("Hello World", 3)
    repeat("Hello World")

    //

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun max(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}