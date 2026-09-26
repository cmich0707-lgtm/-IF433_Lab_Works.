package week5

fun main() {
    // Inisialisasi objek
    val wallet = EWallet("User EWallet", 50000.0)
    val card = CreditCard("User CreditCard", 100000.0)

    // Masukkan ke dalam list bertipe PaymentMethod
    val paymentList: List<PaymentMethod> = listOf(wallet, card)

    // Perulangan untuk memproses pembayaran
    for (payment in paymentList) {
        payment.processPayment(75000.0)
    }
}