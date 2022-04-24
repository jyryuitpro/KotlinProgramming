package chap03.section3

fun sum(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int) = a * b

fun main() {
    val result = sum(10, 3)
    val resutl2 = mul(sum(3, 3), 2)

    println("result: $result, result2: $resutl2")
    println(funcFunc())
}

fun funcFunc(): Int {
    return sum(2, 2)
}