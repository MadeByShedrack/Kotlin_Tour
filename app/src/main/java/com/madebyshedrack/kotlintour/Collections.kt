fun main() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    for (shape in readOnlyShapes) {
        println("My Shapes -> $shape")
    }
    println()

    val mutatedShapes: MutableList<String> = mutableListOf("polygon", "octagon")
    mutatedShapes.add("nonagon")
    mutatedShapes.add("hexagon")
    println(mutatedShapes)

    for (mutated in mutatedShapes){
        println("My mutated shapes -> $mutated")
    }
    println()
    val newShaped: List<String> = mutatedShapes
    println("New shape -> $newShaped")
    println("The first item on the list is -> ${mutatedShapes.first()}")
    println("The last item on the list is -> ${mutatedShapes.last()}")
    println("Length -> ${mutatedShapes.count()}")
    println("Contain hexagon -> ${mutatedShapes.contains("hexagon")}")
    println("nonagon" in mutatedShapes)
    println(mutatedShapes.removeAt(0))
    println()
    getSet(setOf("Apple", "banana", "cherry", "cherry"))
    println()
    getMutableSet(mutableSetOf("mercury", "venus", "earth", "mars", "jupiter", "mars"))
    println()
    getFoodMenu(mapOf("$0.5" to "burger", "$1.5" to "pizza", "$12.5" to "chicken"))
    println()
    usersInfo(mutableMapOf("shedrack" to 24, "Jlex" to 23))
}

fun getSet(readOnlyFruits: Set<String>) {
    println("Read Only Fruits -> $readOnlyFruits")
    println()
    for (fruits in readOnlyFruits) {
        println("My read only fruits: $fruits")
    }
}

fun getMutableSet(planet: MutableSet<String>) {
    planet.add("saturn")
    planet.add("uranus")
    planet.add("neptune")
    planet.forEachIndexed { index, myPlanet ->
        println("Planet position: $index -> Planet name: $myPlanet")
    }
}

fun getFoodMenu(foodMenu: Map<String, String>) {
    foodMenu.forEach { key, value  ->
        println("Price: $key -> Food Name: $value")
    }
}

fun usersInfo(usersDetail: MutableMap<String, Int>): Unit {
    usersDetail.put("jeff", 20)
    usersDetail.put("dave", 31)
    usersDetail.put("shalom", 27)
    usersDetail.put("honor", 24)
    usersDetail.forEach { value, key ->
        println("Name: $value -> Age: $key")
    }
}