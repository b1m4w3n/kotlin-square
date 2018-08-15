fun main(args: Array<String>) {
    println("result: " + max(2, 3))
    println("result2: " + max2(2, 3))
    println("result3: " + max3(2, 3))
    println("Hello, world!")
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b: Int): Int = if (a > b) a else b

// Should probably avoid using 'type inference' in function returns, in real world
fun max3(a: Int, b: Int) = if (a > b) a else b