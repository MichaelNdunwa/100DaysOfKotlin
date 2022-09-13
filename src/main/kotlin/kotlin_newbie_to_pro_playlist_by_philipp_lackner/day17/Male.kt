package kotlin_newbie_to_pro_playlist_by_philipp_lackner.day17

class Male(val name: String, val age: Int) : Person(1)  {
    init {
        println("My name is $name am $age years old, and am a male.")
    }
}