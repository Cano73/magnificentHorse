open class UserScore (): Horses(){
    data class User(var name: String, var score: Int)

    private val users = mutableListOf<User>()

    fun addScore(username: String, score: Int) {
        var user = users.find { it.name == username }
        if (user == null) {
            user = User(username, score)
            users.add(user)
        } else {
            user.score += score
        }
    }

    fun getScore(username: String): Int {
        val user = users.find { it.name == username }
        return user?.score ?: 0
    }
}
