### 19강. 코틀린의 이모저모

- Type Alias 와 as import

    ```kotlin
    typealias FruitFilter = (Fruit) -> Boolean
    
    fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {}
    
    --
    
    package com.lec19.a.Hello as HelloA
    package com.lec19.b.Hello as HelloB
    
    fun main() {
    	HelloA.함수()
    	HelloB.함수()
    }
    ```

- 구조분해와 componentN 함수
    - 구조분해 : 복합적인 값을 분해하여 여러 변수를 한 번에 초기화하는 것
- Jump 와 Label
    - return : 가장 가까운 enclosing function 또는 익명함수로 값이 반환
    - break : 가장 가까운 루프 제거
    - continue : 가장 가까운 루프를 다음 step 으로 보냄
- Takelf 와 TakeUnless

    ```kotlin
    // 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null 을 반환
    fun getNumberOrNullV2(): Int? {
    	return number.takeIf { it > 0 }
    }
    
    // 주어진 조건을 만족하지 않으면 그 값, 그렇지 않으면 null 반환
    fun getNumberOrNullV3(): Int? {
    	return number.takeUnless { it <= 0 }
    }
    ```