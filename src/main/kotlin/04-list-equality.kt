class Person (val firstName: String, val age: Int) {
}

fun main() {
    val feri = Person("Feri", 26)
    val list1 = listOf(feri)
    val list2 = listOf(feri)
    println(list1 == list2)
    println(list1 === list2)
}

// 04-list-equality.kt