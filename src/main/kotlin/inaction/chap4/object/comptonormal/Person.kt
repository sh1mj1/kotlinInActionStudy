package inaction.chap4.`object`.comptonormal

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person(val name: String) {
    companion object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person {
            val name = jsonText
                .removeSurrounding("{", "}")
                .split(":")
                .last()
                .trim()
                .removeSurrounding("'")

            return Person(name)
        }
    }

}

fun <T> loadFromJSON(factory: JSONFactory<T>): T {
    // // 실제로는 jsonText 를 네트워크나 DB 에서 불러오지만, 여기선 그냥 넣어주자.
    val jsonText = "{name: 'Dmitry'}"
    return factory.fromJSON(jsonText)
}
