package lec14

import lec14.kotlin.*

fun main() {
    /**
     * 1. Data Class
     */
    val personDto1 = PersonDto("최태현", 100)
    val personDto2 = PersonDto("최태현", 200)
    val personDto3 = PersonDto("최태현", 100)

    println(personDto1==personDto2)
    println(personDto1==personDto3)

    /**
     * 2. Enum Class
     *
     * when 과 함께 사용할 경우, 직관적이며 깔끔한 코드 작성 가능
     * when 을 사용할 경우 컴파일러가 모든 타입을 알고 있으므로 다른 타입에 대한 로직을 작성하지 않아도 된다
     */

    /**
     * 3. Sealed Class, Sealed Interface
     *
     * Sealed Class
     *  - 상속이 가능하지만, 외부에서는 해당 클래스를 상속 못함
     *  - 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다. 즉, 런타임때 클래스 타입이 추가될 수 없다
     *  - Enum 과 다른점
     *   - 클래스를 상속받을 수 있다.
     *   - 하위 클래스는 멀티 인스턴스가 가능하다
     *
     * TIP : 추상화가 필요한 Entity or DTO 에 sealed class 를 활용!
     */
    handleCar(Avante())

}

fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}