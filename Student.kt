
class Student (val name: String, val nim: String, val major) {
    init {
        if (nim.length !=5) {
            println("Warning objek tercipta dengan NIM ($nim) yang tidak  valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")

        } else {
            println("LOG: objek student $name berhasil dialokasikan di Memory.")
        }
    }
}
construction (name: string, nim: string) : this(name, nim, major = "Non-Matriculated") {
    println("LOG: Menggunakan construction jalur umum (Tanpa Jurusan).")
}

