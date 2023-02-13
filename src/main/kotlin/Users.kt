open class Users : UserScore() {

    fun addUserScore(username: String, score: Int) {
        addScore(username, score)
    }
}