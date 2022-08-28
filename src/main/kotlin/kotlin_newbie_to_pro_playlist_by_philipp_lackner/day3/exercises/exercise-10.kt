package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day3.exercises

// Write a program that sums up an Array.
fun main() {
    val myArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var sumUp = 0
    for(i in myArray) {
        sumUp += i
    }
    println("The sum of the array is $sumUp")
}