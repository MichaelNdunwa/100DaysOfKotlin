package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day3.exercises

// Write a program that calculates the average of 5 numbers.

fun main() {
    println("Enter 5 numbers:")
    var sum = 0
    for (i in 1..5) {
        val input = readLine()!!.toInt()
        sum += input
    }
    println("The average value is ${sum / 5.0}")
}