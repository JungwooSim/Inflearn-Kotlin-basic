package lecture.lec16

fun main() {
    /**
     * 1. 확장함수
     * 어떤 클래스안에 있는 메소드처럼 호출할 수 있지만, 함수는 밖에 만들 수 있게 하는 것
     *
     * 규칙
     * - 확장함수는 원본 클래스의 private, protected 멤버 접근이 안된다.
     * - 확장함수와 멤버함수의 시그니쳐(method name)이 같으면 멤버함수가 우선적으로 호출된다.
     */
    val str = "ABC"
    println(str.lastChar())

}

// String Class 를 확장하는 확장함수
fun String.lastChar(): Char {
    return this[this.length - 1]
}