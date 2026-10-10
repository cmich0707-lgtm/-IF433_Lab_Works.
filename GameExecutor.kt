fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> {
            println("Status: Berada di SafeZone. Aman untuk beristirahat.")
        }
        is BattleState.MonsterEncounter -> {
            println("Status: Bertemu monster! Musuh muncul -> ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            println("Status: Loot didapat! Item: ${event.item.name}, Damage: ${event.item.damage}, Rarity: ${event.item.rarity}")
        }
        is BattleState.GameOver -> {
            println("Status: Game Over! Alasan: ${event.reason}")
        }
    }
}