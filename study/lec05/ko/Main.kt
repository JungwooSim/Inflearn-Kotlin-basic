package study.lec05.ko

fun main() {

}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun validate(score: Int) {
    if (score in 0..100) {
        println("ok")
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0 ,-1 -> println("NO")
        else -> println("OK")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("is 0")
        number % 2 == 0 -> println("짝수")
        else -> println("홀수")
    }
}