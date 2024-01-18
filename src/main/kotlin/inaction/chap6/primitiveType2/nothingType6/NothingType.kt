package inaction.chap6.primitiveType2.nothingType6

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}