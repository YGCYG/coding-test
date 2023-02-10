package programmers.level1

// 문자열 내 마음대로 정렬하기
class SortYourOwnStrings {
    fun solution(strings: Array<String>, n: Int): Array<String> = strings.sortedWith(compareBy({ it[n] }, { it })).toTypedArray()
}