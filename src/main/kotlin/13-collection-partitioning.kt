fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")
    val (match, rest) = numbers.partition { it.length == 3 }

    println("MATCH: $match")
    println("REST: $rest")
}

// 13-collection-partitioning.kt