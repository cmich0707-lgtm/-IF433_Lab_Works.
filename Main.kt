import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan judul buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan nama peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan lama pinjam (hari): ")
    var loanDuration = scanner.nextInt()

    // Validasi lama pinjam tidak boleh minus
    if (loanDuration < 0) {
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)

    println("\n=== Detail Peminjaman ===")
    println("Judul Buku    : ${loan.bookTitle}")
    println("Peminjam      : ${loan.borrower}")
    println("Lama Pinjam   : ${loan.loanDuration} hari")
    println("Total Denda   : Rp ${loan.calculateFine()}")
}