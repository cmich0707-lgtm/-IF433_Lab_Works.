package week7

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== Test Companion OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}