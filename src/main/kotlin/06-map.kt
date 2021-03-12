class Student(val name: String, val specialization: String) {}

fun main() {
    val bela = Student("Tóth Béla", "Mérnökinformatikus")
    val feri = Student("Kovács Ferenc", "Közgazdász")
    val laci = Student("Szabó Laszló", "Bölcsészmérnök")

    val neptun = mutableMapOf("HAXXOR" to bela, "MONEY$" to feri, "MCDNLS" to laci)

    neptun.get("HAXXOR")
    neptun.replace("HAXXOR", feri)
    neptun.remove("MCDNLS")

    println("Contains HAXXOR Neptun-code: ${"HAXXOR" in neptun}")
    println("Contains Feri: ${ feri in neptun.values }")
    println("Contains Feri: ${ neptun.containsValue(feri) }")
}

// 06-map.kt