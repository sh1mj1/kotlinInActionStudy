package inaction.chap4.`object`.companion

import inaction.chap4.propertyinterface.getFacebookName

class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
    }
}


class User2 {
    val nickname: String
    constructor(email: String) {
        nickname = email.substringBefore('@')
    }
    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }
}
