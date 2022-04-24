package chap03.section3

fun main() {
    val result: Int

    val multi = {x: Int, y: Int ->
        println("x + y")
        x * y
    }
    val multi2: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
    val multi3: (Int, Int) -> Int = {x, y -> x * y}
//    val multi4 = {x, y -> x * y}

    val greet: () -> Unit = { println("Hello") }
    val nestedLambda: () -> () -> Unit = { { println("World!") } }
    val nestedLambdaReturnValue: () -> () -> Int = { { 20 } }

    result = multi(10, 20)
    println(result)
    println(greet)
    greet()
    nestedLambda()()
    val test = nestedLambdaReturnValue()()
    println(test)
}