import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan base damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    println("\n=== MINI RPG BATTLE ===")
    println("Hero: ${hero.name}")
    println("HP: ${hero.hp}")
    println("Damage: ${hero.baseDamage}")
    println("Enemy HP: $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {
        println("\n=== MENU ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        if (choice == 1) {
            // Hero menyerang
            hero.attack("Enemy")

            enemyHp -= hero.baseDamage

            // HP Enemy tidak boleh minus
            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP Enemy tersisa: $enemyHp")

            // Jika Enemy masih hidup, Enemy membalas
            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()

                println("Enemy menyerang ${hero.name}!")
                println("Damage yang diterima: $enemyDamage")

                hero.takeDamage(enemyDamage)

                println("HP ${hero.name} tersisa: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} memilih untuk kabur!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    // Menentukan hasil akhir
    println("\n=== HASIL PERTARUNGAN ===")

    if (hero.hp > 0 && enemyHp <= 0) {
        println("${hero.name} menang!")
    } else if (hero.hp <= 0 && enemyHp > 0) {
        println("Enemy menang!")
    } else if (hero.hp > 0 && enemyHp > 0) {
        println("${hero.name} kabur dari pertarungan.")
    } else {
        println("Pertarungan berakhir.")
    }
}