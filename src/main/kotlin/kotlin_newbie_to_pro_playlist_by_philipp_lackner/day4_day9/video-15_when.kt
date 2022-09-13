package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day4_day9

fun main() {
    println("How old are you? ")
    when(readLine()!!.toInt()) {
        in 6..17 -> println("You're a young kid.")
        18 -> println("Finally, you're 18!.")
        19, 20 -> println("You're a young adult.")
        in 21..65 -> println("You're an adult.")
        else -> println("You're really old.")
    }
}