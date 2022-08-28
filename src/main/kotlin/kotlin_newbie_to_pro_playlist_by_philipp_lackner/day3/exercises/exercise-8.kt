package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day3.exercises

fun main() {
    print("Enter any number: ")
    var userInput = readLine()!!.toInt()
    println("Lets count from $userInput down to 0:")
    while(userInput >= 0) {
        println(userInput--)
    }
}