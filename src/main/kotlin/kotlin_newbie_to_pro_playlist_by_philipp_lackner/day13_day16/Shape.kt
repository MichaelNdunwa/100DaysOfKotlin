package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day13_day16

open class Shape(var name: String) {
    init {
        println("I am the Super Class")
    }

   open fun changeName(newName: String) {
        name = newName
    }
}