package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day3.exercises

// Create a program that checks whether the user input is a Palindrome.

fun main() {
    println("Enter a string to check whether it's a Palindrome or not.")
    print(">> ")
    val userInput = readLine()
    if(userInput == userInput?.reversed()) {
        println("$userInput is a Palindrome.")
    } else {
        println("$userInput is not a Palindrome.")
    }
}