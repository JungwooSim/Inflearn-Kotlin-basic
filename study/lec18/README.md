### 18강. 코틀린에서 컬렉션을 함수형으로 다루는 방법

- 필터와 맵
- 다양한 컬렉션 처리 기능
    - all : 조건을 모두 만족하면 true, 그렇지 않으면 false

        ```kotlin
        fruits.all { fruit -> fruit.name == "사과"}
        ```

    - none : 조건을 모두 불만족하면 true 그렇지 않으면 false

        ```kotlin
        fruits.none { fruit -> fruit.name == "사과"}
        ```

    - any : 조건을 하나라도 만족하면 true, 그렇지 않으면 false

        ```kotlin
        fruits.any { fruit -> fruit.factoryPrice >= 10000}
        ```

    - sortedBy (오름차순) , sortedByDescending (오름차순)

        ```kotlin
        fruits.sortedBy { fruit -> fruit.currentPrice }
        fruits.sortedByDescending { fruit -> fruit.currentPrice }
        ```

    - distinctBy : 변형된 값을 기준으로 중복을 제거

        ```kotlin
        fruits.distinctBy { fruit -> fruit.name }.map { fruit -> friut.name }
        ```

- List 를 Map 으로
  - 

    ```kotlin
    // 과일이름 -> List<과일>
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    
    // 과일이름 -> List<출고가>
    val map: Map<String, List<Long>> = fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })
    ```

- 중첩된 컬렉션 처리