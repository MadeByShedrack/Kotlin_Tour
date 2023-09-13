fun main() {
    for (index in 1..12) {
        if (index % 2 == 0) {
            println("$index is even")
        } else {
            println("$index is old")
        }
    }
    println()
    var sum = 0
    var index = 0

    while (index <= 40) {
        sum += index
        index++
    }

    println("Sum -> $sum")

    for (letters in 'a'..'z') {
        println("Alphabetical letters -> $letters")
    }
}