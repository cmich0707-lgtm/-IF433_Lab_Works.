
fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 700000

    val discountPercent = calculateDiscount(price)
    val discountAmount = price * discountPercent / 100
    val finalPrice = price - discountAmount

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice
    )
}

fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int) {
    println("=== STRUK PEMBELIAN STEAMKW ===")
    println("Judul Game  : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Harga Akhir : Rp $finalPrice")
    println("===============================")
}