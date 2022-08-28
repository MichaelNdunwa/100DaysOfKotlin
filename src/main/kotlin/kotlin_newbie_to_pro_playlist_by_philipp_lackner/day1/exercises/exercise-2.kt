package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day1.exercises

fun main() {
    val (x, y, z) = Triple(3, 4, 5)
    println("""
    |x: $x
    |x + y: ${x + y}
    |x + y + z: ${x + y + z}
    """.trimMargin("|"))
}