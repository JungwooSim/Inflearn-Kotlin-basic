package study.lec16.ko

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

// 확장함수 Ex , String Class 를 확장
fun String.lastChar(): Char {
    return this[this.length - 1]
}