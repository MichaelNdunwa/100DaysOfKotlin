package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day11_day12

import kotlin_newbie_to_pro_playlist_by_philipp_lackner.day13_day16.Shape

class Rectangle(val a: Double, val b: Double): Shape("Rectangle") {
    init {
        println("Rectangle created with a = $a and b = $b")
    }

    fun area() = a * b
    fun perimeter() = 2 * a + 2 * b
    fun isSquare() = a == b
}