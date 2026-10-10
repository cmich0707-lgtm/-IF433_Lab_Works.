fun main() {
    // 7. Uji Singleton GameManager (Dipanggil 2 kali)
    GameManager.startGame()
    GameManager.startGame()

    println("\n----------------------------------\n")

    // 8. Simulasi Rarity dan Factory Senjata
    println("Drop Chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata Dibuat: ${starterWeapon.item.name} | Damage: ${starterWeapon.item.damage} | Durability: ${starterWeapon.durability}")

    println("\n----------------------------------\n")

    // 9. Modifikasi Immutability (copy) & Simulasi Event Berurutan
    val upgradedItem = starterWeapon.item.copy(damage = 25, name = "Pedang Kayu Besi Tajam")

    println("--- Memulai Simulasi Event Pertarungan ---")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}