package lecture.lec02

fun main() {

    /**
     * Safe Call 과 Elvis 연산자
     */
    // null 이 아니면 실행하고, null 이면 실행하지 않는다. (그대로 null)
    val str: String? = "ABC"
    // str.length // 불가능
    str?.length // 가능 - Safe Call

    val str2: String? = null
    println(str2?.length ?: 0) // null 이면 0 출력

    /**
     * 널 아님 단언
     */
    println(startsWithA5("ABC")) // 만약 null 이 매게변수로 넘겨지면 Runtime Error 에서 NPE 에러 발생

    /**
     * 플랫폼 타입(코틀린이 null 관련 정보를 알 수 없는 타입)
     * Kotlin 에서 Java 코드를 가져다 사용할 때 어떻게 처리 되는지?
     * Ex. Java 에서 @Nullable 어노테이션을 사용했을때 Kotlin 에서 어노테이션을 인식해서 활용함
     */
}

// null 허용, 반환타입이 null 이 될 수 없는 경우
fun startsWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null!!")
//    }
//    return str.startsWith("A")

    // 코틀린 스럽게
    return str?.startsWith("A") ?: throw IllegalArgumentException("null!!")
}

// null 허용, 반환타입이 null 이 될 수 있는 경우
fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")

    // 코틀린 스럽게
    return str?.startsWith("A")
}

// null 허용, 반환타입이 null 이 될 수 없는 경우
fun startsWithA3(str: String?): Boolean {
//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")

    // 코틀린 스럽게
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String): Boolean {
    return str.startsWith("A")
}

// 단언
fun startsWithA5(str: String?): Boolean {
    return str!!.startsWith("A")
}