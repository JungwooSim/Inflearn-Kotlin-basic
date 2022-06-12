package lec04

fun main() {
    /**
     * 2. 비교연산자와 동등성, 동일성
     * 코틀린에서는 Java 와 다르게 객체를 비교할 때 비교 연산자를 사용하면 자동으로 compareTo 를 호출해 준다.
     *
     * Java 에서는 동일성 검증에 == 사용하고, 동등성에 equals 를 직접 호출 하였다.
     * Kotlin 에서는 동일성 검증에 === 사용하교, 동등성에 == 를 호출하면 간접적으로 equals 를 호출해준다.
     */
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = money1

    if (money1 > money2) {
        println("Money1 이 Money2 보다 금액이 큽니다.")
    } else {
        println("Money2 이 Money1 보다 금액이 큽니다.")
    }

    println(money1 == money2)
    println(money1 === money2)

    /**
     * 3. 논리 연산자와 코틀린에 있는 특이한 연산자
     * in / !in
     * - 컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다.
     *
     * a..b
     * a 부터 b 까지의 범위 객체를 생성한다.
     *
     * a[i] : a 에서 특정 index i 로 값을 가져온다
     * a[i] = b : a 의 특정 index i 에 b 를 넣는다
     */
}