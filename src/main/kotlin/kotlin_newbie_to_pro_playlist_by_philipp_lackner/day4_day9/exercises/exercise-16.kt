package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day4_day9.exercises

val theList = listOf(3, 2, 5, 1, 5, 6, 7)
fun main() {
    println("The list looks like the following: $theList")
    println("Search for this number:")
    val userInput = readLine()!!.toInt()
    println(search(userInput))
}

fun search(unknown: Int): String {
    for (i in theList) {
        if (i == unknown) return "The index of $unknown is ${theList.indexOf(i)}"
    }
    return "$unknown is not in the list."
}