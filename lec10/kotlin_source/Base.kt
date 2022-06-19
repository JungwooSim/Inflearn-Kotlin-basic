package lec10.kotlin_source

// class 를 상속하기 위해서는 부모 클래스에서 open 으로 열어줘야 함
open class Base (
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}