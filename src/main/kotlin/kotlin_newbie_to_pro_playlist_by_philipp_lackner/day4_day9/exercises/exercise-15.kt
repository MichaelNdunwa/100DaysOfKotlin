package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day4_day9.exercises

fun main() {
    print("Enter any number: ")
    println(sumUp(readLine()!!.toInt()))
}

fun sumUp(number: Int): String {
    var sum = 0
    for (i in 1..number) {
        sum += i
    }
    return "The sum of the values from 1 to $number is $sum"
}