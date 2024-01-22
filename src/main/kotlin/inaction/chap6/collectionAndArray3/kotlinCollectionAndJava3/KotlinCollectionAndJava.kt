package inaction.chap6.collectionAndArray3.kotlinCollectionAndJava3

fun printInUppercase(list: List<String>): String { // read-only 파라미터임.
    println(CollectionUtils.uppercaseAll(list)) // 컬렉션을 변경하는 자바 함수 호출
    return list.first() // 컬렉션이 변경되었는지 확인하기
}