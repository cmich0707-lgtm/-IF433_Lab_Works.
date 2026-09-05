package oop_148836_MichaelSitompul.week2



print("Pilih Jalur (1. Reguler, 2. Umum): ")
val type = scanner.nextInt()
scanner.nextLine()

if (type == 1) {
    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()
    // Memanggil Primary Constructor
    val s1 = Student(name, nim, major)
    println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
} else if (type == 2) {

    val s2 = Student(name, nim)
    println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
} else {
    println("Pilihan ngawur, pendaftaran batal!")
}

