package study.lec20

import study.lec09.ko.Person

fun main() {

}

fun printPerson(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}