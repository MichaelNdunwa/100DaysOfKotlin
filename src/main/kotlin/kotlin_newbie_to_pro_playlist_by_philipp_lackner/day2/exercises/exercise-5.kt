package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day2.exercises

// In this exercise evaluate the expressions without running it.
fun main() {
    // Number 1:
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
                        // false || true && true
                        // false || true
                        // true.

    // Number 2:
    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val hardExpression = !(x != z) && bool || z > (x + y) && (!bool || y < z)
                        // !false && true || false && true
                        // true || false
                        // true.

    // To check whether am correct:
    println("""
        simpleExpression = $simpleExpression
        hardExpression = $hardExpression
    """.trimIndent())
}