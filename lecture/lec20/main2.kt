package lecture.lec20

fun main() {
    val data = listOf("one", "two", "three")

    println(
        data.map { "${it}_a" }
    )
}