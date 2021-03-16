import java.net.URL

class FoodProduct(
    var name: String = "",
    var brand: String = "",
    var imgUrl: URL? = null,
    var ingredients: List<String> = listOf(),
    var calories: Int = 0,
    var weight: Int = 0,
    var isVegan: Boolean = false,
    var isDiabetic: Boolean = false
    ) {
    override fun toString(): String {
        return "FoodProduct(name='$name', brand='$brand', imgUrl=$imgUrl, ingredients=$ingredients, calories=$calories, weight=$weight, isVegan=$isVegan, isDiabetic=$isDiabetic)"
    }
}

fun main() {
    val icecream1 = FoodProduct("Chocolate Icecream", "Magnum",
        URL("https://img.example.com/file/ice-cream.png"),
        listOf("milk", "chocolate", "sugar", "water"),
        2000, 1000, false, false
    )

    val icecream2 = FoodProduct()
    icecream2.name = "Chocolate Icecream"
    icecream2.brand = "Magnum"
    icecream2.imgUrl = URL("https://img.example.com/file/ice-cream.png")
    icecream2.ingredients = listOf("milk", "chocolate", "sugar", "water")
    icecream2.calories = 2000
    icecream2.weight = 1000

    val icecream3 = FoodProduct().apply {
        name = "Chocolate Icecream"
        brand = "Magnum"
        imgUrl = URL("https://img.example.com/file/ice-cream.png")
        ingredients = listOf("milk", "chocolate", "sugar", "water")
        calories = 2000
        weight = 1000
    }

    println(icecream3)

}

// 27-scope-function-apply.kt