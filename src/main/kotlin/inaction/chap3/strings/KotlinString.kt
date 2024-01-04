package inaction.chap3.strings

fun splitString1(string: String) = println(string.split("[.\\-]".toRegex()))

fun splitString2(string: String) = println(string.split(".", "-"))

fun parsePath1(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePath2(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, ext: $extension")
    }
}

fun multilineString() {
    val kotlinLogo = """|  //
                       .| //
                       .|/ \"""
    println(kotlinLogo.trimMargin("."))
}
