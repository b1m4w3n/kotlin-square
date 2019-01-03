import java.util.*

fun main(args: Array<String>) {
    println("result: " + max(2, 3))
    println("result2: " + max2(2, 3))
    println("result3: " + max3(2, 3))
    println("Hello, world!")

    val message: String
    if (true) {
        message = "Success"
    }
    else {
        message = "Failure"
    }
    println("message: $message")

    val languages = arrayListOf("Java")
    languages.add("Kotlin")
    println("Languages: " + languages)

    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")

    println("Hello, ${if (args.size > 0) args[0] else "someone"}")

    val person = Person("Bob", true)
    println("Hello, ${person.name}. Married: ${person.isMarried}")

    val shape = Rectangle(5, 6)
    println("Is this a square? ${shape.isSquare}")

    println("random rectangle: ${createRandomRectagle().isSquare}")

    println(Color.BLUE.rgb())

    println(getMnemonic(Color.YELLOW))

//    var answer = 42
//    answer = "no answer"
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b: Int): Int = if (a > b) a else b

// Should probably avoid using 'type inference' in function returns, in real world
fun max3(a: Int, b: Int) = if (a > b) a else b

class Person(
        val name: String,
        var isMarried: Boolean
)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
    get() {
        return height == width
    }
}

fun createRandomRectagle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

enum class Color (
        val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0,255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238,130,238);

    fun rgb()= (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }