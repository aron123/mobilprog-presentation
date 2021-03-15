fun main() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let { println(it) }

    val string: String? = null //"Some example text"
    val length = string?.let {
        println("let() is called on string.")
        // ... processNonNullString(it) ...
        string.length
    }
    println(length)

    val greetingText = listOf("Jani", "Feri", "Béla").let {
        val lastName = it.last()
        val greeting = "Hello"
        "$greeting $lastName!"
    }
    println(greetingText)
}

// 24-scope-function-let.kt