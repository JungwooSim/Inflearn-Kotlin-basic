package lecture.tmp

/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21


 */

fun main() {
    println(solution(123))

    println(solution(-123))

    println(solution(120))
}

fun solution(num: Int): Int {
    var result = 0
    var num = num

    while (num != 0) {
        val x = num % 10  // 123 / 10 = 3
        num /= 10 // 12

//        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && x > 7)) return 0
//        if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && x < -8)) return 0

        println("${result} * 10 + ${x}")
        result = result * 10 + x
    }

    return result
}