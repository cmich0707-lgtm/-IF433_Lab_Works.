package oop_001_johnthor.week08

fun main() {
    val rawApiData: List> = listOf(
    mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
    mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
    mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
    mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
    mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            // Membungkus pemanggilan parseProduct dengan try-catch
            val product = parser.parseProduct(raw)

            // Jika sukses dan tidak me-return null, panggil method checkout()
            product?.let {
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            // Cetak peringatan log jika data korup (tertangkap di catch)
            println("Peringatan Data Korup: ${e.message}")
        }
    }
}