package lecture.lec10.kotlin_source

class Penguin(
    species: String
) : Animal(species, legCount = 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직임")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        // 중복되는 인터페이스를 특정할 때는 super<타입>.함수 를 사용
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}