package programmers.level0.day21

class AlienDictionary {
    fun solution(spell: Array<String>, dic: Array<String>): Int =
        dic.filter { it.length == spell.size }
            .filter { it.length == it.toList().distinct().size }
            .filter { it.toCharArray().all { c -> c.toString() in spell } }
            .let { if ( it.isNotEmpty() ) 1 else 2 }

    // containsAll 이란 키워드도 있음. 공부해 볼 것.
}