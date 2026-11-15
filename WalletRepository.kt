
class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(query: String): List<T> {
        return items.filter { item ->
            if (item is Coin) {
                item.name.contains(query, ignoreCase = true)
            } else {
                false
            }
        }
    }
}