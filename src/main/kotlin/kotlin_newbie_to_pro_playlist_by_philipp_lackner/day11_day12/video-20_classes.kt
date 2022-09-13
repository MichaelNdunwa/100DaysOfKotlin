package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day11_day12

fun main() {
/*    println("For Rectangle:")
    val myRectangle = Rectangle(4.4, 2.3)
    println("Rectangle area is ${myRectangle.area()}")
    println("Rectangle perimeter is ${myRectangle.perimeter()}")
    println("Rectangle square? ${myRectangle.isSquare()}")

    println("\nFor Circle:")
    val myCircle = Circle(5.0)

    println("\nFor Triangle:")
    val myTriangle = Triangle(3.0, 4.0, 5.0)*/

    val myCircle1 = Circle(5.0)
    myCircle1.changeName("Emmanuel")
    println(myCircle1.name)

    val myTriangle = Triangle(4.3, 2.3, 2.3)
    myTriangle.changeName("Michael")
    println(myTriangle.name)
}