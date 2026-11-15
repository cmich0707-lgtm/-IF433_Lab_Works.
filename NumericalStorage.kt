

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun <T> getMax(a: T, b: T): T where T : Comparable<T> {
        return if (a > b) a else b
    }
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}