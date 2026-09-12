class Player(
    val username: String
) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) return

        val previousLevel = level
        xp += amount

        if (level > previousLevel) {
            println("Level Up! Selamat $username naik ke level $level!")
        }
    }
}