package lecture.lec05

fun main() {
    /**
     * 2. Expression 과 Statement
     * Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다.
     * Expression : 하나의 값으로 도출되는 문장
     */

    /**
     * 3. Switch 와 When
     */
}

fun validateScoreIsNotNegative(score: Int) {
//    if (score < 0) {
//        throw IllegalArgumentException("${score} 는 0보다 작을 수 없습니다.")
//    }

    if (score !in 0..100) {
        throw IllegalArgumentException("score 의 범위는 0 부터 100사이가 아니다.")
    }
}

fun getPassOrFail(score: Int): String {
//    if (score >= 50) {
//        return "P"
//    } else {
//        return "F"
//    }

    // Expression 형식
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
//    if (score >= 90) {
//        return "A"
//    } else if (score >= 80) {
//        return "B"
//    } else if (score >= 70) {
//        return "C"
//    } else {
//        return "D"
//    }

    // Expression 형식
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

fun getGradeWithSwitch(score: Int): String {
//    return when(score / 10) {
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        else -> "D"
//    }

    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startWith(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A") // smart casting 으로 인해 string 으로 판단
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1 이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    return when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 순자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}