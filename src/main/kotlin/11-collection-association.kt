fun main() {
    val numbers = listOf("one", "two", "three", "four")

    println(numbers.associateWith { it.length })

    println(numbers.associateBy { it.first().toUpperCase() })
}

// 11-collection-association.kt