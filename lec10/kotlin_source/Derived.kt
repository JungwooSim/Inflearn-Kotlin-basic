package lec10.kotlin_source

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived")
    }
}