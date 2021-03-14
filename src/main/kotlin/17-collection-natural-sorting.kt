class Player(private val userName: String, private val level: Int): Comparable<Player> {
    override fun compareTo(other: Player): Int {
        if (this.userName == other.userName) {
            return this.level - other.level;
        }

        return this.userName.compareTo(other.userName);
    }

    override fun toString(): String {
        return "{'$userName', $level}"
    }
}

fun main() {
    val players = mutableListOf(
        Player("Feri", 25),
        Player("Pisti", 13),
        Player("Béla", 14),
        Player("Pisti", 22),
        Player("Pisti", 13),
        Player("Feri", 22)
    )

    players.sort()

    println(players)
}

// 17-collection-natural-sorting.kt