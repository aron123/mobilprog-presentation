fun main() {
    val fruits = listOf("alma", "körte", "szilva")
    val uppercaseFruits = fruits.map { it.toUpperCase() }
    println(uppercaseFruits)

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val even = numbers.mapNotNull { if (it % 2 != 0) null else it }
    println(even)
}

// 09-collection-mapping.kt
