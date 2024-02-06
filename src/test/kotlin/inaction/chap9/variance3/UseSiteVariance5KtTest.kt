package inaction.chap9.variance3

import org.junit.jupiter.api.Test
import kotlin.reflect.KClass

class UseSiteVariance5KtTest {
    @Test
    fun testCopyData1() {
        val ints = mutableListOf(1, 2, 3)
        val anyItems = mutableListOf<Any>()
        copyData1(ints, anyItems)
        println(anyItems)
        /* print
        [1, 2, 3]
         */
    }

    @Test
    fun testCopyData2() {
        val ints = mutableListOf(1, 2, 3)
        val anyItems = mutableListOf<Any>()
        copyData2(ints, anyItems)
        println(anyItems)
        /* print
        [1, 2, 3]
         */
    }

    @Test
    fun testCopyData3() {
        val ints = mutableListOf(1, 2, 3)
        val anyItems = mutableListOf<Any>()
        copyData3(ints, anyItems)
        println(anyItems)
        /* print
        [1, 2, 3]
         */
    }

    @Test
    fun testValidator() {
        val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
        validators[String::class] = DefaultStringValidator
        validators[Int::class] = DefaultIntValidator

//        validators[String::class]!!.validate("") // [COMPILE ERROR] Type mismatch: inferred type is String but Nothing was expected
        // 1.3.72 이전 버전: Out-projected type 'FieldValidator<*>' prohibits the use of 'public abstract fun validate(input: T): Boolean defined in FieldValidator'

        val stringValidator =
            validators[String::class] as FieldValidator<String> // [WARN] Unchecked cast: FieldValidator<*>? to FieldValidator<String>
        println(stringValidator.validate(""))

        val stringValidator2 =
            validators[Int::class] as FieldValidator<String> // Unchecked cast: FieldValidator<*>? to FieldValidator<String>
        stringValidator2.validate("")
    }

    @Test
    fun testEncapsulatedValidator() {
        Validators.registerValidator(String::class, DefaultStringValidator)
        Validators.registerValidator(Int::class, DefaultIntValidator)
        println(Validators[String::class].validate("Kotlin"))
        println(Validators[Int::class].validate(42))
//        println(Validators[String::class].validate(42)) // [COMPILE ERROR] The integer literal does not conform to the expected type String
    }
}