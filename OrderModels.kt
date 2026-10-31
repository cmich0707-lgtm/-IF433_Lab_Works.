class City(val name: String)
class Address(val city: City?)
class DeliverDetails(val address: Address?)
class Order(val deliverDetails: DeliverDetails?, val totalPrice: Int)
