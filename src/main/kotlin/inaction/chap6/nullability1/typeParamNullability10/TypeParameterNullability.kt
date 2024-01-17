package inaction.chap6.nullability1.typeParamNullability10

fun <T> printHashCode1(t: T){
    println(t.hashCode())
}

fun <T: Any> printHashCode2(t: T){
    println(t.hashCode())
}