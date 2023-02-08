package programmers.level0.daily.day24

class ChickenCoupon {
    fun solution(chicken: Int): Int = service(chicken, 0)

    tailrec fun service(coupon: Int, total: Int): Int {
        return if ( coupon < 10 ) total
        else service(coupon/10 + coupon%10, total+coupon/10)
    }
}