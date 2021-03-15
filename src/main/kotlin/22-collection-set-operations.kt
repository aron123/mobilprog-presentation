fun main() {
    val A = (1..15).toSet()
    val B = (7..21).toSet()

    println("A: $A")
    println("B: $B")
    println("A u B: ${ A union B }")
    println("A ∩ B: ${ A intersect B }")
    println("A \\ B: ${ A subtract B }")
}

// 22-collection-set-operations.kt