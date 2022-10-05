package study.lec02.ko

import study.lec02.Person
import java.lang.IllegalArgumentException

fun main() {
  val str: String? = null
  println(str?.length) // Safe Call, 결과값 : null

  println(str?.length ?: 0) // Elvis 연산자, 결과값 : 0

  // --

  val person: Person = Person("공부하는 개발자")
}

fun startsWithA1(str: String?): Boolean {
  return str?.startsWith("A") ?: throw IllegalArgumentException("null 이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
  return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
  return str?.startsWith("A") ?: false
}

// null 이 아님을 단언! (만약 null 이면 NPE 발생)
fun startsWith(str: String?): Boolean {
  return str!!.startsWith("A")
}
