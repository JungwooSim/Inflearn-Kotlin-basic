### 20강. 코틀린의 scope function

- scope function 이란 무엇인가?
    - 람다를 사용하여 일시적인 영역을 만들고 코드를 더 간결하게 만들거나, method chaning 에 활용하는 함수
- scope function 의 분류


    |  | it 사용
    (생략이 불가능, 다른 이름을 붙일 수 있다.) | this 사용
    (생략이 가능, 다른 이름을 붙일 수 없다.) |
    | --- | --- | --- |
    | 람다의 결과 | let | run |
    | 객체 그 자체 | also | apply |
- 언제 어떤 scope function 을 사용해야 할까?
    - let
    - run : 객체 초기화와 반환 값의 계산을 동시에 해야할 때
    - apply : 객체 설정을 할 때에 객체를 수정하는 로직이 call chain 중간에 필요할 때
    - also : 객체를 수정하는 로직이 call chain 중간에 필요할 때
    - with : 특정 객체를 다른 객체로 변환해야 하지만 모듈 간의 의존성에 의해 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때

        ```kotlin
        return with(person) {
        	PersonDto(
        		name = name,
        		age = age
        	)
        }
        ```

- scope function 과 가독성