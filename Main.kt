fun main() {
    val manager = Manager("Budi", 10000000)
    val developer = Developer("Andi", 8000000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}