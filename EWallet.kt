package week5

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - EWallet] Pembayaran sebesar $amount berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName - EWallet] Saldo tidak cukup. Saldo saat ini: $balance, dibutuhkan: $amount")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - EWallet] Top up berhasil sebesar $amount. Saldo baru: $balance")
    }
}