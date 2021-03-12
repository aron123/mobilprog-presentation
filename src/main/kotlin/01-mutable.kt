fun main () {
    var immutableFruits = listOf<String>("alma", "körte", "szilva")
    immutableFruits = listOf<String>("alma", "körte", "szilva", "banán")
    println("IMMUTABLE: $immutableFruits")

    val mutableFruits = mutableListOf<String>("alma", "körte", "szilva")
    mutableFruits.add("banán")
    println("MUTABLE: $mutableFruits")
}

// 01-mutable.kt