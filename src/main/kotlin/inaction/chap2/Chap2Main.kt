package inaction.chap2

class Chap2Main {
    fun main(args: Array<String>) {
        // 중괄호로 둘러싼 식 안에서 큰 따옴표를 사용할 수도 있다.
        println("Hello, ${if (args.size > 2) args[2] else "Kotlin"}!")
        println("Hello2, ${if (args.size > 1) args[1] else "normal string ${args[0]}"}")
    }

}