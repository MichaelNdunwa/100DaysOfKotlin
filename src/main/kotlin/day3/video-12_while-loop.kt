package day3

fun main() {
    val myArray = arrayOf("Hello", "Guys", "Whats up?")
    val arrayLength = myArray.size
    var i = 0
    // printing all the elements in myArray using while-loop.
    while(i < arrayLength) {
        println(myArray[i++])
    }
}