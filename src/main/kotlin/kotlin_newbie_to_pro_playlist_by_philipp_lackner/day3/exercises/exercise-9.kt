package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day3.exercises

import kotlin.math.pow

fun main() {
    println("Enter number 1:")
    val firstNum = readLine()!!.toInt()
    println("Enter number 2:")
    val secondNum = readLine()!!.toInt()

    println("$firstNum to the power of $secondNum is " +
            "${firstNum.toDouble().pow(secondNum).toInt()}")
}