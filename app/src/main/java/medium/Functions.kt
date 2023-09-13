import android.net.wifi.WifiInfo

fun hello() {
    return println("Hello, world")
}

fun multiples(vararg names: String) {
    names.forEachIndexed { index, name ->
        println("Index: $index, Name: $name")
    }
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "info") {
    println("[$prefix] $message")
}

fun printMessage(message: String) {
    println("Message -> $message")
}

fun mySum(x: Int, y: Int) = x + y

fun main() {
    hello()
    multiples("shedrack", "john", "mary")
    println(sum(12, 15))
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    printMessage("Buy bread on your way home")
    println(mySum(20, 43))
}