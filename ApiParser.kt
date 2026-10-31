package oop_001_johnthor.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Wajib pakai requireNotNull untuk ID
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }

        // Wajib pakai requireNotNull untuk Name
        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // Ekstrak warranty menggunakan as? Int dengan fallback Elvis (?: 12)
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                // Ekstrak size menggunakan as? String dengan fallback Elvis (?: "All Size")
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        // Ekstrak ID dari product dengan pola when (karena ia sealed class)
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // Lempar ID tersebut ke JavaPaymentService.processPayment(id)
        // Gunakan !! pada hasil tangkapannya untuk membuktikan Java Interop
        val transactionId = JavaPaymentService.processPayment(id)!!
        println("Checkout Berhasil! Produk: ${product.name}, Transaksi ID: $transactionId")
    }
}