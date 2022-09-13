package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day11_day12

fun main() {
    println("Please enter a number: ")
    val userInput = readLine()!!.toInt()
    println(userInput.isPrime())
}

fun Int.isPrime(): String {
    for (i in 2..this.div(2)) {
//        if (this < 1) return "All positive integers are not considered as prime numbers."
        if (this % i == 0) return "$this is not a prime number."
    }
    return "$this is a prime number."
}