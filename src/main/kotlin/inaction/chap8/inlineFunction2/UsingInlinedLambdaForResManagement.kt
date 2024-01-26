package inaction.chap8.inlineFunction2

import java.io.BufferedReader
import java.io.FileReader

fun readFirstLineFromFile(path: String): String {
    // BufferedReader 객체를 만들고 use 함수를 호출하면서 파일에 대한 연산을 실행할 람다를 넘긴다.
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine() // 리소스(파일)에서 맨 처음 가져온 한 줄을 람다가 아닌 readFirstLineFromFile 에서 리턴한다.
    }
}