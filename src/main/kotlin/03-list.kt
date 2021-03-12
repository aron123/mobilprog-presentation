fun main() {
    val list = listOf("iit", "uni-miskolc", "hu")
    // val list = listOf("hu", "iit", "uni-miskolc", "hu")
    println(list.get(0))
    println(list[1])
    println(list[list.lastIndex])
    println("Index of TLD: ${list.indexOf("hu")}")
}

// 03-list.kt