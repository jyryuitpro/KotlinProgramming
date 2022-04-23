package chap02.section3

fun main() {
    // 스마트 캐스트
    var test: Number = 12.2
    println("$test")

    test = 12
    println("$test")

    test = 120L
    println("$test")

    test += 12.0f
    println("$test")
}