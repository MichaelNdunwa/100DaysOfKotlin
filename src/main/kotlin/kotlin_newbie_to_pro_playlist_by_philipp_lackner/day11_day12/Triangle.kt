package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day11_day12

import kotlin_newbie_to_pro_playlist_by_philipp_lackner.day13_day16.Shape
import kotlin.math.sqrt

class Triangle(val a: Double, val b: Double, val c: Double) : Shape("Triangle") {
    init {
        println("$name created with a = $a, b = $b, c = $c")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    /*fun area() =  sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) *
                (perimeter() / 2 - c))
*/

    private fun perimeter(): Double {
        return a + b + c
    }

    fun area(): Any {
        val p = perimeter() / 2
        return sqrt(p * (p - a) * (p - b) * (p - c))
//        return sqrt((perimeter() / 2) * (perimeter() / 2 - a) *
//                (perimeter() / 2 - b) * (perimeter() / 2 - c))
    }
}