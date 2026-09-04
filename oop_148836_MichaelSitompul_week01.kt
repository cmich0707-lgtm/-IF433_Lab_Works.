package oop_001_johnthor.week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 700000

    val discountPercent = calculateDiscount(price)
    val discountAmount = price * discountPercent / 100
    val finalPrice = price - discountAmount
}

fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10