package programmers.level1

// 바탕화면 정리
class DesktopCleanup {
    fun solution(wallpaper: Array<String>): IntArray =
        wallpaper.mapIndexed { idx, str -> idx to str.indexOf('#') }
            .filterNot { it.second < 0 }
            .let { li ->
                intArrayOf(
                    li.minOf { it.first },
                    li.minOf { it.second },
                    li.maxOf { it.first } + 1,
                    wallpaper.maxOf { str -> str.lastIndexOf('#') } + 1
                )
            }
}