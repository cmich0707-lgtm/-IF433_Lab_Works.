package week5

class MathHelper {
    // Luas persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Luas persegi panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Luas lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}