fun main() {
    val numbers = mutableListOf("one")
    numbers.add("two")
    numbers.addAll(listOf("three", "five"))
    numbers.addAll(3, listOf("four"))

    numbers.retainAll(listOf("three", "four", "five", "six", "seven"))

    println(numbers)
}

// 21-collection-write-operation.kt