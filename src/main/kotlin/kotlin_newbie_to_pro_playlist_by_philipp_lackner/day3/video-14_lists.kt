package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day3

fun main() {
    val list = mutableListOf<Int>()
    for(i in 1..5) {
        val x = readLine()!!.toInt()
        list.add(x)
    }
    println(list)
}