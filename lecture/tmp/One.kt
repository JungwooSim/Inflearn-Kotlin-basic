package lecture.tmp

/*
입출력 예
[[1, 2, 3], [4, 5, 6], [7, 8, 9]]	["Rotate", "ShiftRow"]	[[8, 9, 6], [4, 1, 2], [7, 5, 3]]
[[8, 6, 3], [3, 3, 7], [8, 4, 9]]	["Rotate", "ShiftRow", "ShiftRow"]	[[8, 3, 3], [4, 9, 7], [3, 8, 6]]
[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]	["ShiftRow", "Rotate", "ShiftRow", "Rotate"]	[[1, 6, 7 ,8], [5, 9, 10, 4], [2, 3, 12, 11]]
 */

fun main() {
    val rc = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))
    val operations = arrayOf("Rotate", "ShiftRow")

//    val rc = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))
//    val operations = arrayOf("ShiftRow", "Rotate", "ShiftRow", "Rotate")

    val result = solution(rc, operations)

    result.forEach { a -> println(a.contentToString()) }
}

fun solution(rc: Array<IntArray>, operations: Array<String>): Array<IntArray> {

    for (i in operations) {
        when (i) {
            in "Rotate" -> rotate(rc)
            in "ShiftRow" -> shiftRow(rc)
        }
    }

    return rc
}

fun rotate(rc: Array<IntArray>): Array<IntArray> {
    val tmp = arrayListOf<IntArray>()

    for (i in 0 .. rc.size) {
        tmp[i] = rc[i].copyOf()
    }

//    for (i in 0 .. rc.size) {
//        rc[2][2] = tmp_1[2]
//        rc[2][1] = tmp_2[2]
//        rc[2][0] = tmp_2[1]
//        rc[1][2] = tmp_0[2]
//        rc[1][0] = tmp_2[0]
//        rc[0][1] = tmp_0[0]
//        rc[0][2] = tmp_0[1]
//        rc[0][0] = tmp_1[0]
//    }

    val tmp_0 = rc[0].copyOf()
    val tmp_1 = rc[1].copyOf()
    val tmp_2 = rc[2].copyOf()

    rc[2][2] = tmp_1[2]
    rc[2][1] = tmp_2[2]
    rc[2][0] = tmp_2[1]
    rc[1][2] = tmp_0[2]
    rc[1][0] = tmp_2[0]
    rc[0][1] = tmp_0[0]
    rc[0][2] = tmp_0[1]
    rc[0][0] = tmp_1[0]

    return rc
}

fun shiftRow(rc: Array<IntArray>): Array<IntArray> {
    val tmp = rc[rc.size-1].copyOf()

    for (i in rc.size-1 .. 0) {
        rc[i] = rc[i-1]

        if (i == 0) rc[0] = tmp
    }

    return rc
}