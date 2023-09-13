fun main() {
    val timesInMinutes = listOf(2, 10, 15, 1)
    val minutesToSecond = calculateTime("minute")
    val totalSeconds = timesInMinutes.map(minutesToSecond).sum()
    println("Total time is $totalSeconds secs")
}

fun calculateTime(time: String) : (Int) -> Int = when(time) {
    "hour" -> {value -> value * 60 * 60}
    "minute" -> {value -> value * 60}
    "second" -> {value -> value}
    else -> {value -> value}
}