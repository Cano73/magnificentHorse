open class HorsemanHorsewomanVarious {
    data class User(var name: String, var age: Int, var username: String, var password: String, var score: Int)

    private val users = mutableListOf<User>()

    fun register() {
        println("1. Register with Apple ID")
        println("2. Register with Google account")
        println("3. Register with username and password")
        print("Enter your choice: ")
        val choice = readLine()!!.toInt()
        when (choice) {
            1 -> println("Registration with Apple ID.")
            2 -> println("Registration with Google account.")
            3 -> registerWithUsernameAndPassword()
        }
    }

    fun registerWithUsernameAndPassword() {
        print("Enter your name: ")
        val name = readLine()!!
        print("Enter your age: ")
        val age = readLine()!!.toInt()
        var username = ""
        while (true) {
            print("Enter your username: ")
            username = readLine()!!
            if (!usernameExists(username)) break
            println("Username already exists. Please try another.")
        }
        print("Enter your password: ")
        val password = readLine()!!
        users.add(User(name, age, username, password, 0))
        println("Registration successful. Welcome, $username!")
    }

    private fun usernameExists(username: String): Boolean {
        for (user in users) {
            if (user.username == username) {
                return true
            }
        }
        return false
    }
}



