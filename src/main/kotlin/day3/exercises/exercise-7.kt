package day3.exercises

// Write a program that checks whether you're an adult or still a child.

fun main() {
    println("Please enter your age.")
    print(">> ")
    val userAge = readLine()!!.toInt()
    when (userAge) {
        in 0..17 -> println("You're not an Adult yet.")
        in 18..65 -> println("You're an Adult.")
        else -> println("You're really really old.")
    }
}