package effective.item46

inline fun requestNewToken(
    hasToken: Boolean,
    crossinline onRefresh: () -> Unit,
    noinline onGenerate: () -> Unit
) {
    if (hasToken) {
        httpCall("get-token", onGenerate)
        // 인라인이 아닌 함수를 아규먼트로 함수에 전달하려면 noinline 을 사용
    } else {
        httpCall("refresh-token"){
            onRefresh()
            // Non-local 리턴이 허용되지 않는 컨텍스트에서
            // inline 함수를 사용하고 싶다면 crossinline 을 사용.
            onGenerate()
        }

    }
}

fun httpCall(url: String, callback: () -> Unit) {
    /* ... */
}