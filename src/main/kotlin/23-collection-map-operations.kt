fun main() {
    var numbers = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5)
    println("${numbers.get("one")}, ${numbers["one"]}, ${numbers["six"]}")

    val keyStartsWithT = numbers.filterKeys { it.startsWith("t") }
    val valueIsEven = numbers.filterValues { it % 2 == 0 }
    println(keyStartsWithT)
    println(valueIsEven)

    val startsWithTandEven = numbers.filter { (key, value) -> key.startsWith("t") && value % 2 == 0 }
    println(startsWithTandEven)

    println()
    println(numbers + Pair("six", 6))
    println(numbers + mapOf("six" to 6, "seven" to 7))
    println(numbers - "one")
    println(numbers - listOf("one", "two"))

    numbers = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5)
    println()
    numbers.put("six", 6)
    numbers.putAll(listOf("seven" to 7, "eight" to 8))
    numbers.remove("one")
    numbers.keys.removeAll(listOf("two", "three"))
    numbers.values.remove(4)
    println(numbers)
}

// 23-collection-map-operations.kt