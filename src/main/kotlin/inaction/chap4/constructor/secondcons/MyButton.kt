package inaction.chap4.constructor.secondcons

import javax.naming.Context
import javax.print.attribute.AttributeSet
import javax.print.attribute.HashAttributeSet

class MyButton : View {
    constructor(context: Context) : super(context){ /* ...*/ }
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) { /* ...*/ }
}

class ThisButton: View{
    constructor(context: Context): this(context, HashAttributeSet()){ /* ...*/ }
    constructor(context: Context, attrs: AttributeSet): super(context, attrs) { /* ...*/ }
}
