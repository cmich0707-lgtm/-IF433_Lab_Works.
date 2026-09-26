package week5

class CreditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - CreditCard] Transaksi sebesar $amount sukses. Total pemakaian: $usedAmount/$limit")
        } else {
            println("[$accountName - CreditCard] Transaksi ditolak. Melebihi limit kredit ($limit)")
        }
    }
}