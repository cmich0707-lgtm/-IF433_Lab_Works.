package week5

fun main () {
    val dosen1 = Dosen (nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin (nama = "Bu siti")

    val daftarPegawai: list<Pegawai> = listof(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (Pegawai in daftarPegawai) {
        pegawai.bekerja()


        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NION: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("----------------------")
    }
}