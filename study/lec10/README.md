### 10강. 코틀린에서 상속을 다루는 방법

- 추상 클래스
- 인터페이스
    - kotlin 에서는 default 키워드를 사용하지 않아도 된다.
- 클래스를 상속할 때 주의할 점
    - 상위 클래스를 설계할 때, 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open 을 피해야 한다
- 상속 관련 지시어 정리
    - final : override 를 할 수 없게 함. default 로 보이지 않게 존재
    - open : override 를 열어 준다
    - abstract : 반드시 override 해야 한다
    - override : 상위 타입을 오버라이드 하고 있다