package inaction.chap4.accessbacking

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                Address was changed for $name:
                "$field" -> "$value".
            """.trimIndent()
            )
            field = value
        }
}