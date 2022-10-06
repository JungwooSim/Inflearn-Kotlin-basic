package study.lec04.ko

import study.lec04.JavaMoney
import study.lec04.Money

fun main() {
  val money1 = JavaMoney(2000)
  val money2 = JavaMoney(1000)

  if (money1 > money2) {
    println("Money1 이 Money2 보다 금액이 큽니다.")
  }

  // ---
  val money3 = JavaMoney(1000)
  val money4 = money3
  val money5 = JavaMoney(1000)

  println(money3 === money4) // result : true
  println(money3 == money4) // result : true

  // ---
  val money6 = Money(1000)
  val money7 = Money(2000)
  println(money6 + money7)
}