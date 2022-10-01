package lecture.lec12

class Person private constructor(
    var name: String,
    var age: Int
) {
    // static 대신 companion object 를 사용
    // const 키워드는 컴파일 시에 변수를 할당한다는 의미이다 -> 상수를 의미
    // companion object 에 유틸성 함수들을 넣어도 되지만, 최상단 파일을 활용하는 것을 추천.
    companion object Factory : Log {
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person 클래스의 동행 객체")
        }
    }
}

/**
 * singleton
 */
object Singleton {
    var a: Int = 0
}