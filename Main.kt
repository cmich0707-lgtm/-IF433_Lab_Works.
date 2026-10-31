fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destinations = emptyOrder.deliverDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan Pengiriman: $destinations")
}

