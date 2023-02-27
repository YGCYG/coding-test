package programmers.level1

// 대충 만든 자판
class RoughKeyboard {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray =
        targets.map { str ->
            str.map { c -> keymap.map { it.indexOf(c) + 1 }
                .filterNot { it < 1 }
                .let { list ->
                    if (list.isEmpty()) -1
                    else list.minOf { it }
                }
            }.let { if ( it.contains(-1)) -1 else it.sum() }
        }.toIntArray()
}