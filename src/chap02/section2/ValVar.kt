package chap02.section2

fun main() {
    val number:Int = 10
    val number2 = 10
    // Variable is never modified so it can be declared using 'val'
    var numberOfBooks: Int = 30
    // Can be joined with assignment
    val init: Int

//    val language = "English"
    var language = "English"

//    Kotlin: Val cannot be reassigned
    language = "Korean"

    init = 10

    println("number: $number, number2: $number2, init: $init")
    println("language: $language, Books: $numberOfBooks")
}