package inaction.chap4.innernested.java;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ButtonTest {

    @Test // 자바 ButtonState 가 static 이 아니면 성공
    void javaButtonStateSerializeTest() {
        Button button = new Button();
        Button.ButtonState state = (Button.ButtonState) button.getCurrentState();
        assertThrows(NotSerializableException.class, () -> {
            // 객체를 직렬화하여 ByteArrayOutputStream 에 쓰기 시도
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(state); // 이 시점에서 NotSerializableException 발생 예상
            oos.close();
        });
    }

    @Test // 자바 ButtonState 가 static 이면 성공
    void javaButtonStateSerializeTest2() {
        Button button = new Button();
        Button.ButtonState state = (Button.ButtonState) button.getCurrentState();
        assertDoesNotThrow(() -> {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(state); // 이 시점에서 NotSerializableException 발생 예상
            oos.close();
        });
    }


}
