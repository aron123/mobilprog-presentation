fun main() {
    val set1 = setOf(1, 2, 3, 4)
    val set2 = setOf(2, 4, 3, 1)
    println("Contains number 3: ${set1.contains(3)}")
    println("Structurally equals: ${set1 == set2}")
    println("Referentially equals: ${set1 === set2}")
}

// 05-set.kt