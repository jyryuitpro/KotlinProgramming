package chap02.section4

fun main() {
    val num = 4 // 0100 -> 0001 0000
//    val num = -4

    println(num.shl(2)) // * 2
    println(num shl 2) // 중위 표현법 (infix)

    println(num.shr(2)) // / 2
    println(num shr 2) // 중위 표현법 (infix)
    println(num.ushr(2))
}