package study.lec10.ko

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}