package inaction.chap4.constructor.primcons


/*
class User constructor(_nickname: String) {
    val nickname: String

    init { // initializer block(초기화 블록)
        nickname = _nickname
    }
}
 */

/*
class User constructor(nickname: String) {
    val nickname: String
    init {
        this.nickname = nickname
    }
}
*/


/*
class User(_nickname: String) {
    val nickname = _nickname
}
 */

//class User(val nickname: String)

open class User(val nickname: String, val isSubscribed: Boolean = true)

class TwitterUser(nickname: String) : User(nickname)