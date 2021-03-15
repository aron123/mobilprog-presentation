class MultiportService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default request"
    fun query(request: String): String = "Result for query '$request' to $url:$port"
}

fun main() {
    val service = MultiportService("https://example.kotlinlang.org", 80)
    val result = service.run {
        port = 8080
        val request = prepareRequest()
        query(request)
    }
    println(result)

    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"
        Regex("[$sign]?[$digits$hexDigits]+")
    }
    println("VALID HEX: ${hexNumberRegex.matches("!!!b3ff0211")}")
}