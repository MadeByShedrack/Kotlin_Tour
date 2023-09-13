fun uppercasedString(string: String): String {
    return string.uppercase()
}

fun main() {
    println(uppercasedString("hello world"))
    println({fullName: String -> fullName.uppercase()}("shedrack abel"))
    val getNameLength = ({nameLength: String -> nameLength.length}("OgdenMorrow"))
    println("Name length: $getNameLength")
    val toCap = {capitalizeName: String -> capitalizeName.capitalize()}
    println(toCap("shedrack"))
    println()
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)
    val myNumbers = listOf<Int>(1, -2, 3, -4, 5, -6)
    val doubled = myNumbers.map { x -> x * 2 }
    val tripled = myNumbers.map { x -> x * 3 }
    println("Doubled: $doubled")
    println("Trippled: $tripled")
}