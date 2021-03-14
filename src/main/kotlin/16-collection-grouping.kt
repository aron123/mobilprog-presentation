fun main() {
    val numbers = setOf("one", "two", "three", "four", "five")
    println(numbers.groupBy { it.first().toUpperCase() })
}

// 16-collection-grouping.kt