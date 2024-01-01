@file:JvmName("StringFunctions")

package inaction.chap3

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    postfix: String = "",
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

var opCount = 0

fun performOperation() {
    opCount++
    // ....
}

fun reportOperationCount() = println("Operation performed $opCount times")

const val UNIX_LINE_SEPARATOR = "\n"