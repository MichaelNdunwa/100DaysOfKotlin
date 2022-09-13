package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day4_day9

fun main() {
    printlnThreeLines()
    println(printlnPow(3, 5))
}

fun printlnPow(base: Int, exponent: Int): String {
    var result = 1
    repeat(exponent) {
        result *= base
    }
    return "$base to the power of $exponent is $result."
}

fun printlnThreeLines() {
    println("First Line.")
    println("Second Line.")
    println("Third Line.")
}