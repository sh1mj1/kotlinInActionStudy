package inaction.chap5.lambdaWithReceiver5.apply2

fun alphabetUsingApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
}.toString()

fun alphabetUsingBuildString() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
}