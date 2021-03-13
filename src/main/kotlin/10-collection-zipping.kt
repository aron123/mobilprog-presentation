fun main() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf", "lion")
    val zipped = colors.zip(animals)
    println(zipped)

    println(zipped.toMap())

    val (unzipped1, unzipped2) = zipped.unzip()
    println(unzipped1)
    println(unzipped2)
}

// 10-collection-zipping.kt