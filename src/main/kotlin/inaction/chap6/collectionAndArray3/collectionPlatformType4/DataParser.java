package inaction.chap6.collectionAndArray3.collectionPlatformType4;

import java.util.List;

// 컬렉션 파라미터가 있는 다른 자바 인터페이스
public interface DataParser<T> {
    void parseData(String input, List<T> output, List<String> errors);
}
