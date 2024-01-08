package inaction.chap4.propertyinterface

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname: String = getFacebookName(accountId)
}

fun getFacebookName(accountId: Int): String {
    println(accountId) // 페이스북 접속, 인증, 원하는 데이터를 리턴하는 코드라고 가정
    return "sh1mj1"
}