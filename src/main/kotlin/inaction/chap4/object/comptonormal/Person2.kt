package inaction.chap4.`object`.comptonormal

/**
 * 동반 객체에 이름 짓기
 */
class Person2(val name: String) {
    companion object Loader {
        fun fromJSON(jsonText: String): Person2 {
            val name = jsonText
                .removeSurrounding("{", "}")
                .split(":")
                .last()
                .trim()
                .removeSurrounding("'")

            return Person2(name)
        }
    }
}
