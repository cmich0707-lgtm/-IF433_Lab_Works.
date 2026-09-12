fun main() {
    // --- Testing Tugas 1: Weapon ---
    val sword = Weapon("Excalibur", 100)

    // Coba set ke -50 (harus gagal/muncul peringatan)
    sword.damage = -50

    // Coba set ke 9999 (harus dipaksa jadi 1000)
    sword.damage = 9999

    // Print Tier-nya (karena damage 1000, harus "Legendary")
    println("Tier Senjata: ${sword.tier}")

    println("-----------------------------------")

    // --- Testing Tugas 2: Player ---
    val player = Player("Hero123")

    // player.xp = 100 // Jika di-uncomment, ini akan ERROR (karena private)

    player.addXp(50)  // Masih level 1
    player.addXp(60)  // Total XP 110, memicu pesann level up ke level 2
}