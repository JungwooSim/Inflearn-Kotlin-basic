package study.lec20

fun main() {

}

// 하나 이상의 함수를 call chain 결과로 호출할 때
fun case1() {
    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let { lengths -> println(lengths) }
}

// non-null 값에 대해서 code block 을 실행시킬 때
fun case2() {
    val str = "AAA"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }
}

// 일회성으로 제한된 영역에 지역변수를 만들 때
fun case3() {
    val numbers = listOf("one", "two", "three", "four")

    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!${firstItem}"
        }.uppercase()

    println(modifiedFirstItem)
}