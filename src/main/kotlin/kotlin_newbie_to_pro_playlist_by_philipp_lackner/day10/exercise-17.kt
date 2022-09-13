package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day10

fun main() {
    val sum = alternatingSum(3, 4, 5, 2, 1, 2, 3)
    println("The alternating sum is $sum")
}

fun alternatingSum(vararg numbers: Int): Any {
    // 3, 4, 5, 2, 1, 2, 3
    // +3-4+5-2+1-2+3
    // Collect like terms i.e even and odd numbers:
    // even numbers: -2-2-4
    // odd numbers: +1+3+3+5

    var even = 0
    var odd = 0
    for (i in numbers) {
        if (i % 2 == 0) {
            even -= i
        }
        else {
            odd += i
        }
    }
    return even + odd
}
