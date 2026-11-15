

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status Respons: ${response.status}")
    println("=== DAFTAR ASET KOIN ===")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Saldo: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 250.0))
    txRepo.add(Transaction("TX-002", 1200.5))

    println("\n=== RIWAYAT TRANSAKSI ===")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Nominal: $${tx.amount}")
    }

    println("\n=== HASIL PENCARIAN KOIN ('BT') ===")
    coinRepo.searchByName("BT").forEach { coin ->
        println("Ditemukan: ${coin.name} (${coin.balance})")
    }
}