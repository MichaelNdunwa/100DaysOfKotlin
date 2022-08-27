package day3

fun main() {
    for(i in 1..3) {
        println(i)
    }

    for(i in 5 downTo 1) {
        println(i)
    }

    for(i in 'a'..'z') {
        println(i)
    }

    val myArray = arrayOf(4, 5, 8, 9, 10, 2, 3)
    println(myArray.max())
}