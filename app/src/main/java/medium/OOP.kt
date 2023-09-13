class Contact (val id: Int, var email: String) {
    val category: String = "Important"

    fun printID() {
        println("ID: $id")
    }
}

data class User(val name: String, val age: Int)

fun main() {
    val contact = Contact(2, "musk@tesla.com")
    println(contact.id)
    println(contact.email)
    println(contact.category)
    contact.printID()
    println()
    val user = User("OgdenMorrow", 45)
    println("Name: ${user.name}")
    println("Age: ${user.age}")
    println(user.copy("Max", 23))
}