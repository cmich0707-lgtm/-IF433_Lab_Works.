package week5

fun main() {
    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(5)
    val luasPersegiPanjang = mathHelper.hitungLuas(4, 6)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("Luas Persegi (sisi 5): $luasPersegi")
    println("Luas Persegi Panjang (4x6): $luasPersegiPanjang")
    println("Luas Lingkaran (r 7.0): $luasLingkaran")
}