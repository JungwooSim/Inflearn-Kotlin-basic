package lecture.lec01

fun main () {
    // 가변
    var number1 = 10L

    // 불변
    val number2 = 10L

    // null 허용 X
    val number3: Long = 10L

    // null 허용
    val number4: Long? = 10L

    // 객체 인스턴스화 (new를 사용 안함)
    val person = Person()
}

class Person (val name: String? = "")