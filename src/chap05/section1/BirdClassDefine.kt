package chap05.section1

class Bird {
    var name: String = "default"
    val wing: Int = 2
    var beak: String = "short"
    var color: String = "Red"

    fun fly() = println("Fly $wing")
    fun sing(vol: Int) = println("Sing $vol")
}

fun main() {
    val coco = Bird()
    coco.color = "Blue"

    println(coco)
    println(coco.color)
}