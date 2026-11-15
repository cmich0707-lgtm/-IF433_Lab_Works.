
fun main() {
    val coinRepo = WalletRepository<Coin>()
    val response = ApiResponse("200 OK", coinRepo.getAll())

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1500.0))
}