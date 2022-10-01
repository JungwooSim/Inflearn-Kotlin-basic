package lecture.lec10.kotlin_source

interface Swimable {
    fun act() {
        println("어푸 어푸")
    }

    // Kotlin 에서는 backing field 가 없는 프로퍼티를 Interface 에 만들 수 있다.
    // val 이므로 구현체에서 getter 에 대한 것을 구현하는걸 기대
    val swimAbility: Int

    // default interface
    val swimAbility2: Int
        get() = 3
}