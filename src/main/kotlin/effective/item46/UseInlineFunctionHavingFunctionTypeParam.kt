package effective.item46

fun repeatNoinline(times: Int, action: (Int) -> Unit) {
    for (index in 0..<times) {
        action(index)
    }
}