package inaction.chap6.collectionAndArray3.readOnlyAndMutableCollection2

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item) // mutable 인 target 컬렉션에 원소를 추가
    }
}