package lec17

/**
 * 정리
 * - 함수는 Java 에서 2급시민이지만, 코틀린에서는 1급시민이다.
 *  - 때문에, 함수 자체를 변수에 넣을 수도 있고 파라미터로 전달 가능하다.
 * - 코틀린에서 함수 타입은 (파라미터 타입...) -> 반환타입 이다.
 * - 코틀린에서는 Closure 를 사용하여 non-final 변수도 람다에서 사용할 수 있다.
 */
fun main() {
    /**
     * 2. 코틀린에서의 람다
     * 자바와 근본적으로 다른점이 있다.
     * - 코틀린에서는 함수가 그 자체로 값이 될 수 있다. 변수에 할당할수도, 파라미터로 넘길 수도 있다.
     */
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000),
    )

    // 람다를 만드는 방법1
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 반환 타입 설정 가능
//    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
//        return fruit.name == "사과"
//    }

    // 람다를 만드는 방법2
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    // 반환 타입 설정 가능
    // (파라미터 타입...) -> 반환 타입
//    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    // 람다를 호출하는 방법
    isApple(fruits[0])
    isApple.invoke(fruits[0])

    // 람다 적용
    val filterFruits: List<Fruit> = filterFruits(fruits, isApple)
    val filterFruits2: List<Fruit> = filterFruits(fruits, { fruit -> fruit.name == "사과" })
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}