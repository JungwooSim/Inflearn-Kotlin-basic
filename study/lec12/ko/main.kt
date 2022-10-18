package study.lec12.ko

import study.lec12.ja.Movable


fun main() {
  // 익명클래스
  moveSomething(object : Movable {
    override fun move() {
      println("move")
    }

    override fun fly() {
      println("fly")
    }
  })
}

private fun moveSomething(movable: Movable) {
  movable.move()
  movable.fly()
}