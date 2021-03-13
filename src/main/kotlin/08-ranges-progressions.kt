fun main() {
    val num = 4
    if (num in 1..4) { // 1 <= num && num <= 4
      println("Value is between 1 and 4")
    }

    for (i in 1..4) print("$i ")
    println()
    for (i in 4 downTo 1) print("$i ")
    println()
    for (i in 1..8 step 2) print("$i ")
    println()
    for (i in 1 until 10) print("$i ")
    println()
}

// 08-ranges-progressions.kt