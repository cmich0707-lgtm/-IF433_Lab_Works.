class NotificationService {
    fun sendemail(emailAddress: String) {
        println("Mengririm email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {

        if (user.email != null) {
            sendEmail(emailAddress = user.email)

        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}