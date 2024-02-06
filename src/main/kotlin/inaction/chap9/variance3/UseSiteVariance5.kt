package inaction.chap9.variance3

fun <T : R, R> copyData1(
    source: MutableList<T>,
    destination: MutableList<R>
) { // source 원소 타입은 destination 원소 타입의 하위 타입
    for (item in source) {
        destination.add(item)
    }
}

fun <T> copyData2(
    source: MutableList<out T>,
    destination: MutableList<T>
) { // out 키워드를 붙이면 T 타입을 in 위치에 사용하는 메서드를 호출하지 않는다는 뜻
    for (item in source) {
        destination.add(item)
    }
}

fun <T> copyData3(source: MutableList<T>, destination: MutableList<in T>) { // source 원소 타입의 상위 타입을 destination 원소 타입으로 허용
    for (item in source) {
        destination.add(item)
    }
}
