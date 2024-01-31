package inaction.chap9.genericTypeParameter1

class Processor<T> {
    fun process(value: T) {
        value?.hashCode() // value 는 nullable 이므로 safe call 을 사용하는 모습
    }
}

class Processor2<T : Any> { // not-null 타입 상한 지정
    fun process(value: T) {
        value.hashCode() // value 는 not-null
    }
}