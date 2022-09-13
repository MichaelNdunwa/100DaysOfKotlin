package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day4_day9.exercises

fun main() {
    println("Which country are you from?")
    when(readLine()!!.uppercase()) {
        "NIGERIA" -> println("Hi")
        "CHINA" -> println("Nin Hao")
        "INDIA" -> println("Namaste")
        "JAPAN" -> println("Ohayo")
        "RUSSIA"  -> println("Zdravstvuyte")
        "USA" -> println("Hey")
    }
}