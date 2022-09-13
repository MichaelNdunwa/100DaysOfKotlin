package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day4_day9.exercises

// Fibonacci series:

fun main() {
    // fib = (nthTerm  - firstTerm) + (nthTerm - secondTerm)

    print("Enter any number that is greater than 1:  ")
    val userInput = readLine()!!.toInt()
    val fibonacciList = mutableListOf(0, 1)
    var firstTerm = fibonacciList[0]
    var secondTerm = fibonacciList[1]
    var nextTerm = firstTerm + secondTerm
    repeat(userInput - 2) {
        fibonacciList.add(nextTerm)
        firstTerm = secondTerm
        secondTerm = nextTerm
        nextTerm = firstTerm + secondTerm
    }
    println(fibonacciList)

    /*   Another method for solving fibonacci sequence
       for (i in 2 until userInput) {
           fibonacciList.add(fibonacciList[i - 2] + fibonacciList[i - 1])
       }*/
}