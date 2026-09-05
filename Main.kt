package oop_148836_MichaelSitompul.week2

import java.util.Scanner

fun mian() {
    val scanner = Scanner( source = System. 'in')
    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (wajib 5 karakter):")
    val nim = scanner.next()

    scanner.nextline()
     if (nim.length != 5) {
         println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")

     } else {
         println("Mausukkan Jurusan: ")
         val major = scanner.nextline()
         val s1 = Student(name, nim, major)
         println("Status: Pendaftaran Selesai.")
     }
}