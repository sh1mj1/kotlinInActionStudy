package inaction.chap2.expr


fun smartCastValLocal() {
    val x: Any = "I am a String"
    if (x is String) {
        println(x.length) // 스마트 캐스트 적용
    }
}

class SmartCastValProperty {
    private val data: Any = "I am a String"

    fun printData() {
        if (data is String) {
            println(data.length) // val 속성은 private, internal이거나 같은 모듈에서 체크되는 경우에 스마트 캐스트가 가능합니다.
        }
    }
}

fun smartCastVarLocal() {
    var x: Any = "I am a String"
    if (x is String) {
        println(x.length) // x가 타입 검사와 사용 사이에서 변경되지 않았을 때 스마트 캐스트 적용 가능
    }
}



class SmartCastVarProperty(private var data: Any = "Hello, Kotlin") {
    fun printData() {
        if (data is String) {
            // 'data'가 'String' 타입으로 스마트 캐스트되지 않기 때문에 오류 발생
//            println(data.length) // 오류: 'data'가 'String'으로 자동 캐스트되지 않음
        }
    }
}

class CastVarProperty(private var data: Any = "Hello, Kotlin") {
    fun printData() {
        if (data is String) {
            // 'data'가 'String' 타입으로 스마트 캐스트되지 않기 때문에 오류 발생
            println((data as String).length) // 명시적으로 String 으로 캐스팅하여 length 속성에 접근 -> 이 방식으로는  컴파일 오류가 발생 안 함
        }
    }
}