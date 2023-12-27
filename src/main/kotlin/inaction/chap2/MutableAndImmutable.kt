package inaction.chap2

class MutableAndImmutable {

    fun initValOnlyOnce() {
        val message: String = if (canPerformOperation()) {
            println("성공시 동작하는 기능들")
            "Success"
            // ...
        } else {
            "Failed"
        }
        println(message)
    }

    private fun canPerformOperation(): Boolean {
        // 이 함수 결과에 따라 message 에 초기화되는 문자열을 결정
        return true
    }

    fun changeValReferenceObj() {
        val languages = arrayListOf("Java")
        languages.add("Kotlin")
    }

    fun stringTemplate(args: Array<String>) {
        val name = if (args.size > 0) args[0] else "Kotlin"
        println("Hello, $name")
    }

}