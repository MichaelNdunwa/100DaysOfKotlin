package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day10

fun main() {
    val array = intArrayOf(10, 20, 25)
    val max = getMax(1, 2, 3, 4, 5, 6, 1, 10, 15, 4, *array)
    println("The maximum is $max.")

    searchFor("How to become a good programmer.")
    searchFor("How to become the best Kotlin programmer", "Yahoo!")
}

fun searchFor(search: String, searchEngine: String = "Google") {
    println("Searching for '$search' on $searchEngine.")
}

fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}