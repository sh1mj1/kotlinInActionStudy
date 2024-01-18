package inaction.chap6.primitiveType2.unitType5

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() { // Unit 을 리턴하지만, 타입을 명시할 필요없다.
        // 처리 코드
        // 여기서 return 을 명시할 필요 없다. 컴파일러가 암시적으로 return Unit 을 넣어
    }
}