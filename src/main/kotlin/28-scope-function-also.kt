fun main() {
    val numbers = mutableListOf(1, 2, 3, 4)

    numbers
        .also { println("List before edition: $it") }
        .add(5)

    println("List after edition: $numbers")
}

// 28-scope-function-also.kt