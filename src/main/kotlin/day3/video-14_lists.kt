package day3

fun main() {
    val list = mutableListOf<Int>()
    for(i in 1..5) {
        val x = readLine()!!.toInt()
        list.add(x)
    }
    println(list)
}