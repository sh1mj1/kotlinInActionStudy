package inaction.chap6.collectionAndArray3.collectionPlatformType4;

import java.io.File;
import java.util.List;

// 컬렉션 파라미터가 있는 자바 인터페이스
public interface FileContentProcessor {
    void processContents(File path, byte[] binaryContents, List<String> textContents);
}
