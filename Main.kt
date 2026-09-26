package week5

fun main() {
    // Task 1: MathHelper Test
    val mathHelper = MathHelper()
    println("--- TASK 1: OVERLOADING ---")
    println("Luas Persegi: ${mathHelper.hitungLuas(5)}")
    println("Luas Persegi Panjang: ${mathHelper.hitungLuas(4, 6)}")
    println("Luas Lingkaran: ${mathHelper.hitungLuas(7.0)}")
    println()

    // Task 2: Payment System & Smart Casting
    println("--- TASK 2: PAYMENT SYSTEM ---")
    val wallet = EWallet("John Doe", 50000.0)
    val card = CreditCard("Jane Doe", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(wallet, card)

    for (payment in paymentList) {
        payment.processPayment(75000.0)

        // Smart Casting Challenge (Checkpoint 11)
        if (payment is EWallet) {
            payment.topUp(50000.0) // Panggil topUp secara otomatis
            payment.processPayment(75000.0) // Coba bayar lagi
        }
        println("----------------------------------------")
    }
}