package effective.item42

data class User(val name: String, val surname: String) {
    // ...
    companion object {
        val DISPLAY_ORDER = compareBy(User::surname, User::name)
    }
}

class User1(val name: String, val surname: String) : Comparable<User1> {
    override fun compareTo(other: User1): Int = compareValues(surname, other.surname)
}

class User2(val name: String, val surname: String) : Comparable<User2> {
    override fun compareTo(other: User2): Int = compareValuesBy(this, other, { it.surname }, { it.name })
}