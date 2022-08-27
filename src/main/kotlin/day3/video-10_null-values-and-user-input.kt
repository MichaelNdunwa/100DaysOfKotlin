package day3

fun main() {
    val userInput = readLine()
    println("You entered ${userInput!!.uppercase()}.")
    println(userInput!!.toInt() - 4)
}