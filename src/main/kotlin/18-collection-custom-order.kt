fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val sorted = numbers.sortedBy { it.length }
    val sortedDescending = numbers.sortedByDescending { it.length }

    println(sorted)
    println(sortedDescending)

    println(sorted.reversed())
    println(numbers.shuffled())
}

// 18-collection-custom-order.kt
