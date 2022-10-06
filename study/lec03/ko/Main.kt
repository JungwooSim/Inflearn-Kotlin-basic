package study.lec03.ko

import study.lec03.Person

fun main() {
  val number1 = 3
  val number2: Long = number1.toLong()

  // String Interpolcation
  val person = Person("최태현", 100)
  println("이름 : ${person.name}")

  val str = """
    ABCD
    EFG
    BIG
  """.trimIndent()
  println(str)

  // String indexing
  println("ABC"[0])

}

fun printAgeIfPerson(obj: Any) {
  if (obj is Person) {
    val person = obj as Person
    println(person.name)
  }

  // not
  if (obj !is Person) {
  }
}