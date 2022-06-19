package lec10.kotlin_source

// 접근제어자는 default 가 public
abstract class Animal(
    protected val species: String,

    // 코틀린에서는 property 를 override 하기 위해서는 open 을 해주어야 함
    protected open val legCount: Int
) {
    abstract fun move()
}