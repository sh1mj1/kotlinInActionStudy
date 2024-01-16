package inaction.chap5.lambdaWithReceiver5.with1

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet")
    return result.toString()
}

fun alphabetUsingWith(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {// 메서드를 호출하려는 수신 객체(receiver) 지정
        for (letter in 'A'..'Z') {
            this.append(letter) // this 를 명시해서 receiver 의 메서드 호출
        }
        append("\nNow I know the alphabet") // this 생략, 메서드 호출
        toString()
    }
}

fun alphabetFinal(): String = with(StringBuilder()) {// 메서드를 호출하려는 수신 객체(receiver) 지정
    for (letter in 'A'..'Z') {
        append(letter) // this 를 명시해서 receiver 의 메서드 호출
    }
    append("\nNow I know the alphabet") // this 생략, 메서드 호출
    toString()
}