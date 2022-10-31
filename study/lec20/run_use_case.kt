package study.lec20.run_use_case

import study.lec09.ko.Person

fun main() {

}

// 객체를 만들어 DB 에 바로 저장 후 해당 인스턴스를 활용할 때
fun case1() {
    val person = Person("big", 10).run { persionRepository::save }

    val person2 = Person("big", 10).run {
        hobby = "독서"
        persionRepository.save(this)
    }


}