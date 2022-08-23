/**
 * Calculate the volume of a Shpere:
 * Use this formula for the volume: 0.75 * PI * radius^3
 */

 import kotlin.math.*

 fun main() {
    val radius = 5.5
    val volume = 0.75 * PI * radius.pow(3)
    println("The Volume of the Sphere with the radius $radius is $volume")
 }