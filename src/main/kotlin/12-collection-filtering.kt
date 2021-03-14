fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")
    val startsWithT = numbers.filter { it.startsWith("t") }
    val notStartsWithT = numbers.filterNot { it.startsWith("t") }
    val evenIndexStartsWithT = numbers.filterIndexed {
            index, value -> index % 2 == 0 && value.startsWith("t")
    }
    
    println(startsWithT)
    println(notStartsWithT)
    println(evenIndexStartsWithT)
}

// 12-collection-filtering.kt