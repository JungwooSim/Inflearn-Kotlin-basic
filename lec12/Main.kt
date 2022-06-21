package lec12

fun main() {

    // singleton 사용법
    println(Singleton.a)

    // 익명함수
    moveSomething(object : Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })

}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

/**
 * 정리.
 * 1. java 의 static 변수와 함수를 만드려면, Kotlin 에서는 companion object 를 사용해야 한다.
 * 2. companion object 도 하나의 객체로 간주되기 때문에 이름을 붙일 수 있고, 다른 타입을 상속받을 수 있다.
 * 3. Kotlin 에서 싱글톤 클래스를 만들 때 object 키워드를 사용한다.
 * 4. Kotlin 에서 익명 클래스를 만들 때 object : 타입 을 사용한다.
 */