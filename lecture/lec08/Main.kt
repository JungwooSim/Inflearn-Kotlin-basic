package lecture.lec08

fun main() {
    repeat("Hello World", useNewLine = false)
    printNameAndGender(
            name = "big",
            gender = "gender"
    )

    /**
     * 4. 같은 타입의 여러 파라미터 받기 (가변인자)
     */
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

/**
 * 1. 함수 선언 문법
 * block {} 을 사용하는 경우에는 반환 타입이 Unit(void) 이 아니면 명시적으로 작성하여야 한다.
 * 단, "=" 을 사용할 경우 생략 가능하다.
 */
fun max(a: Int, b: Int) = if (a > b) a else b

/**
 * 2. default parameter, 3. named argument (parameter)
 */
fun repeat(
    str: String = "Hello",
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

fun printNameAndGender(name:String, gender: String) {
    println(name)
    println(gender)
}

/**
 * 4. 같은 타입의 여러 파라미터 받기 (가변인자)
 * vararg 키워드 사용
 */
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}