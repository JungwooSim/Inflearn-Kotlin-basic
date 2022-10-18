package study.lec12.ko

fun main() {
  println(Singleton.a)
  Singleton.a += 10
  println(Singleton.a)
}

class Person private constructor(
  var name: String,
  var age: Int
) {

  // static 대신 companion object 키워드 사용
 companion object {
   val MIN_AGE = 1
   fun newBaby(name: String): Person {
     return Person(name, MIN_AGE)
   }
 }
}

object Singleton {
  var a: Int = 0
}