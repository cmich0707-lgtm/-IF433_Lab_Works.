package week3

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: gaji tidak boleh negatif! Di-Set ke 0.")
                field = 0
            } else {
                field = value
            }

        }
}
 private var performanceRating int = 3


fun increasePerformance() {
    performanceRating ++
    println("Kinerja $name meiningkat! Rating: $performanceRating")

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}
 val tax: Double
     get() = salary * 0.1
