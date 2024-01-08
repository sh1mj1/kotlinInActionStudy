package inaction.chap4.propertyinterface

interface User2 {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}

class SubscribingUser2(override val email: String) : User2