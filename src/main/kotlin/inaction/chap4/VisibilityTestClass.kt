package inaction.chap4

internal open class SupClass1()

//class SubClass() : SupClass1() // 'public' subclass exposes its 'internal' supertype SupClass1

internal class GenericClass

//class NormalClass<T : GenericClass> // 'public' generic exposes its 'internal' parameter bound type GenericClass

open class SupClass2(protected val protectedField: Int, private val privateField: Int) {
    private fun privateFunc() {}
    protected fun protectedFunc() {}
}

class SubClass2(protectedField: Int, privateField: Int) : SupClass2(protectedField, privateField) {
    fun accessProperty() {
        protectedField
//        privateField // ERROR Cannot access 'privateField': it is invisible (private in a supertype) in 'SubClass2'
    }
}

fun SupClass2.extensionFunc() {
//    this.privateField // ERROR Cannot access 'privateField': it is private in 'SupClass2'
//    this.protectedField // ERROR Cannot access 'protectedField': it is protected in 'SupClass2'
}
