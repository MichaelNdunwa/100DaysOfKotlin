package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day3

fun main() {
    val userInput = readLine()
    println("You entered ${userInput!!.uppercase()}.")
    println(userInput!!.toInt() - 4)
}