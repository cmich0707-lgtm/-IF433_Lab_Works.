
fun main() {
    val coinRepo = WalletRepository<Coin>()
    val response = ApiResponse("200 OK", coinRepo.getAll())
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 250.0))
    txRepo.add(Transaction("TX-002", 1200.5))

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1500.0))

    println("Status Respons: ${response.status}")
    println("=== DAFTAR ASET KOIN ===")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Saldo: ${coin.balance}")
    }
}