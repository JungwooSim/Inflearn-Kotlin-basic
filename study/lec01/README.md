### 1강. 코틀린에서 변수를 다루는 방법

- 변수 선언 키워드 - var 과 val 의 차이점
    - var 은 가변
    - val 은 불변, 단 elements 에서는 추가 가능 (List 의 add())
- Kotlin 에서의 Primitive Type
    - boxing 과 unboxing 을 고려하지 않아도 되도록 Kotlin 이 알아서 처리 ([https://kotlinlang.org/docs/basic-types.html](https://kotlinlang.org/docs/basic-types.html))
- Kotlin 에서의 nullable 변수
    - kotlin 에서는 Type 에 기본적으로 null 값을 할당 못하도록 설계 되어있다.</br>
      그러므로 null 값을 넣기 위해서는 “?” 를 Type ( “Type?” ) 옆에 추가해야 한다.
- Kotlin 에서의 객체 인스턴스화