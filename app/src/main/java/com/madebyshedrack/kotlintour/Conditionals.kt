fun main() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println("Result -> $d")

    val a = 1
    val b = 2

    println(if (a > b) a else b)

    val obj = "1"

    when(obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }
    println()
    print("Day of the week?...")
    val weekDay: String = readln()
    val checkDay = when(weekDay) {
        "Monday" -> "Yay it's monday"
        "Tuesday" -> "Today is tuesday"
        "Wednesday" -> "Today is wednesday"
        "Thursday" -> "Today is thursday"
        "Friday" -> "Today is friday"
        "Saturday" -> "Today is saturday"
        "Sunday" -> "Today is sunday"
        else -> "No day specify"
    }
    println("Day of the week: $checkDay")
    println()
    print("Enter a temperature? ")
    val temperature = readln().toInt()
    val description = when {
        temperature < 0 -> "very cold"
        temperature < 10 -> "a bit cold"
        temperature  < 20 -> "warm"
        else -> "hot"
    }
    println("Temperature -> $description")
}