package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day11_day12

import kotlin_newbie_to_pro_playlist_by_philipp_lackner.day13_day16.Shape
import kotlin.math.*

open class Circle(val radius: Double): Shape("Circle") {
    init {
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    fun area() = radius.pow(2) * PI
    fun perimeter() = 2 * radius * PI
}