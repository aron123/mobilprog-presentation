fun main() {
    val numbers = listOf(1, 2, 3)
    println(numbers.maxByOrNull { it % 3 })
}

// 19-collection-aggregation.kt