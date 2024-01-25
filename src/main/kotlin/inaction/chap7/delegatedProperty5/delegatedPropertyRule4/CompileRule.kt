package inaction.chap7.delegatedProperty5.delegatedPropertyRule4

/*
class C {
    var prop: Type by MyDelegate()
}

// ↓↓↓

class C {
    private val <delegate> = MyDelegate()
    var prop: Type
        get() = <delegate>.getValue(this, <property>)
        set(value: Type) = <delegate>.setValue(this, <property>, value)
}

val c = C()


 */