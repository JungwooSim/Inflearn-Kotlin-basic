package lecture.lec10.kotlin_source

/**
 * JavaCat.java -> Cat.kt
 */
class Cat(
    species: String
) : Animal(species, legCount = 4) { // 상속 받을 땐 " : " 이렇게 양쪽으로 공백 필요

    // java 에서의 @Override 대신에 override 지시어를 사용
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}