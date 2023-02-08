package programmers.level0.daily.day23

class IsLogInSucceed {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        for ( i in db.indices ) {
            if ( id_pw[0] == db[i][0] ) {
                return if ( id_pw[1] == db[i][1] ) "login"
                else "wrong pw"
            } else {
                continue
            }
        }
        return "fail"
    }

}