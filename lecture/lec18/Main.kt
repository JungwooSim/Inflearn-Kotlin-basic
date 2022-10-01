package lecture.lec18

fun main() {

    val fruits = listOf(
        Fruit(1, "사과", 1000),
        Fruit(2, "사과", 1200),
        Fruit(3, "사과", 1200),
        Fruit(4, "사과", 1500),
        Fruit(5, "바나나", 3000),
        Fruit(6, "바나나", 3200),
        Fruit(7, "바나나", 2500),
        Fruit(8, "수박", 10000),
    )

    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    println("apples.size : ${apples.size}")

    val apples2 = fruits.filterIndexed {idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
    println("apples2.size : ${apples.size}")

    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.factoryPrice }
    for (applePrice in applePrices) {
        println("applePrice : ${applePrice}")
    }

    val applePrices2 = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.factoryPrice
        }
    for (applePrice in applePrices2) {
        println("applePrice2 : ${applePrice}")
    }

    val values = fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.currentPrice }
    println("values.size : ${values.size}")

    // 모두 사과 인지
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }

    // 조건을 모두 불만족 하면 true 그렇지 않으면 false
    val isNoApple = fruits.none { fruit -> fruit.name == "사과" }

    // 조건을 하나라도 만족하면 true, 그렇지 않으면 false
    fruits.any { fruit -> fruit.factoryPrice >= 10000 }

    // 총 개수
    fruits.count()

    // 정렬
    fruits.sortedBy { fruit -> fruit.factoryPrice }
    fruits.sortedByDescending { fruit -> fruit.factoryPrice }

    // distinctBy : 변형된 값을 기준으로 중복 제거
    fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    //
    val groupBy: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }

    //
    val map: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    //
    val map2: Map<String, List<Long>> = fruits.groupBy({ fruit -> fruit.name}, {fruit -> fruit.factoryPrice })

    //
    val map3: Map<Long, Long> = fruits.associateBy({fruit -> fruit.id}, {fruit -> fruit.factoryPrice})

    //
    val map4: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과" }

    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "사과", 1000),
            Fruit(2, "사과", 1200),
            Fruit(3, "사과", 1200),
            Fruit(4, "사과", 1500),
        ),
        listOf(
            Fruit(5, "바나나", 3000),
            Fruit(6, "바나나", 3200),
            Fruit(7, "바나나", 2500),
        ),
        listOf(
            Fruit(8, "수박", 10000),
        )
    )

    //
    val samePriceFruit = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }

    // List<List<Fruit>> 를 List<Fruit> 로 변경
    val flatten: List<Fruit> = fruitsInList.flatten()
}