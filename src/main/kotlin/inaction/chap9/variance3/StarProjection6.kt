package inaction.chap9.variance3

import kotlin.reflect.KClass

/*
fun printFirst(list: List<*>) { // 모든 리스트를 인자로 받을 수 있다.
    if (list.isNotEmpty()) { // isNotEmpty() 에서는 제네릭 타입 파라미터를 사용 안 함
        println(list.first()) // first() 는 이제 Any? 를 리턴한다. 이 타입으로도 충분하다
    }
}
*/

fun <T> printFirst(list: List<T>) { // 이 경우에도 모든 리스트를 인자로 받을 수 있다.
    if (list.isNotEmpty()) {
        println(list.first())  // first() 는 이제 T 타입의 값을 리턴한다.
    }
}

interface FieldValidator<in T> { // T 에 대해 contravariant 인터페이스 선언
    fun validate(input: T): Boolean // T 를 in 위치에만 사용(T 타입 값을 consume)
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String): Boolean = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int): Boolean = input >= 0
}

object Validators {
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>() // 앞과 같은 맵을 사용하지만, 외부에서 이 맵에 접근 불가
    fun <T : Any> registerValidator(kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        validators[kClass] = fieldValidator // 어떤 클래스와 validator 타입이 맞는 경우만 그 클래스와 validator 정보를 맵에 key/value 쌍으로 넣는다
    }

    @Suppress("UNCHECKED_CAST") // FieldValidator(T) 캐스팅이 안전하지 않다는 경고를 무시하게 함.
    operator fun <T : Any> get(kClass: KClass<T>): FieldValidator<T> =
        validators[kClass] as? FieldValidator<T>
            ?: throw IllegalArgumentException("No validator for ${kClass.simpleName}")
}