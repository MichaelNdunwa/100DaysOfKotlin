package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day11_day12

fun main() {
    listOf(1, 2, 3, 4, 5, 6).productOfList()
}

fun List<Int>.productOfList() {
    var product = 1
    this.forEach {
        product *= it
    }
    println("The product of $this is $product.")
}