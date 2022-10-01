package lecture.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    /**
     * 1. try catch finally 구문
     */
    parseInt("a")

    parseIntOrThrowV2("a")

    /**
     * 2. Checked Exception 과 Unchecked Exception
     * Kotlin 에서는 Checked Exception 과 UnChecked Exception 을 구분하지 않는다.
     * 모두 Unchecked Exception 이다
     */
    readFile()

    /**
     * 3. try with resources
     * try with resources 는 없다.
     * 대신에 "use" inline 확장 함수를 사용
     */
    readFile2("a")
}

fun parseInt(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

/**
 * Unchecked Exception 이므로 throw 가 없어도 에러가 안난다. (자바에서는 throw 가 필요함)
 */
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

fun readFile2(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}