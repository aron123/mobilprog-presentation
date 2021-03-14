fun main() {
    val lettersABC = listOf('A', 'B', 'C')
    val lettersAtoD = lettersABC + 'D'
    val lettersAtoF = lettersAtoD + listOf('E', 'F')
    val lettersAtoE = lettersAtoF - 'F'

    println(lettersAtoE)

    val numbers = mutableListOf("one", "two")
    numbers += "three"
    numbers += listOf("four", "five")
    numbers -= listOf("one", "two")

    println(numbers)
}

// 15-collection-plusminus.kt