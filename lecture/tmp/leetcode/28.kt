package lecture.tmp.leetcode

/*
28. Find the Index of the First Occurrence in a String
link : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

 */

fun main() {
  println(strStr("sadbutsad", "sad"))
  println(strStr("leetcode", "leeto"))
  println(strStr("hello", "ll"))
}

fun strStr(haystack: String, needle: String): Int {
  val m = haystack.length
  val n = needle.length

  for (i in 0..m - n) {
    if (haystack.substring(i until i + n) == needle) return i
  }

  return -1
}