package lec11

fun main() {
    /**
     * 1. 자바와 코틀린의 가시성 제어
     * public : 모든 곳에서 접근 가능
     * protected : 선언된 클래스 또는 하위 클래스에서만 접근 가능
     * internal : 같은 모듈에서만 접근 가능 / 여기서 모듈은 한 번에 컴파일 되는 Kotlin 코드
     *
     * 코틀린의 기본 접근 지시어는 public 이다
     */

    /**
     * 3. 다양한 구성요소의 접근 제어
     * 생성자에 접근 지시어를 붙이려면, constructor 를 써주어야 한다.
     *
     * TIP : 파일 최상단에 유틸 함수를 작성하면 편하다.
     */

    /**
     * 4. Java 와 Kotlin 을 함께 사용할 경우 주의할 점
     *
     * 코틀린의 Internal 은 바이트 코드상 public 이 된다.
     * 때문에 Java 코드에서는 Kotlin 모듈의 internal 코드로 가져올 수 있다.
     *
     * 코틀린의 protected 와 Java 의 protected 는 다르다.
     * Java 는 같은 패키지의 Kotlin protected 멤버에 접근할 수 있다.
     */


}


class Car(
    internal val name: String, // 생성자에 한번에 접근 제어자 설정
    _price: Int
) {

    var price = _price
        private set // Setter 에만 추가로 가시성을 부여
}