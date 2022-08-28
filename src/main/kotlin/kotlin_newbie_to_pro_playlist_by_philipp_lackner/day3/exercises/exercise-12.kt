package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day3.exercises

// Write a program that prints user input in reversed order.
//    Without using reversed() function.
fun main() {
    val list = mutableListOf<Int>()
    println("Please enter 5 numbers:")
    repeat(5) {
        val userInput = readLine()!!.toInt()
        list.add(userInput)
    }

    // Output:
    println("The 5 numbers you entered in reverse order are:")
    for(i in list.size.minus(1).downTo(0)) {
        println(list[i])
    }
}