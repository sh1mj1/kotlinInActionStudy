package inaction.chap7.destructuringDeclarationAndComponent4

data class NameComponents(val name: String, val extension: String)

fun splitFileName(fullName: String): NameComponents {
    val (name, ext) = fullName.split('.', limit = 2)
    return NameComponents(name, ext)
}

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) { // 루프 변수에 구조 분해 선언 사용
        println("$key -> $value")
    }
}