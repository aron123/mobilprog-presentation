import kotlin.math.round
import kotlin.math.roundToInt

fun main() {
    val numbers = listOf(1.25, 3.18, 0.51, 11.23, 9.85, 12.09, 13.27, 14.66)

    val roundSumReduce = numbers.reduce{ sum, element -> round(sum) + round(element) }
    //val roundSumReduce = numbers.reduce<Number, Double>{ sum, element -> sum.toInt() + element.roundToInt() }
    val roundSumFold = numbers.fold(0) { sum, element -> sum + element.roundToInt() }

    println(roundSumReduce)
    println(roundSumFold)
}

// 20-collection-reduce-fold.kt