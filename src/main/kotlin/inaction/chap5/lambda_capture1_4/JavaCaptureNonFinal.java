package inaction.chap5.lambda_capture1_4;

public class JavaCaptureNonFinal {
    static class Ref<T> {
        T value;

        Ref(T value) {
            this.value = value;
        }
    }

    public int captureNonFinal() {
        Ref<Integer> counter = new Ref<>(0);
        Runnable inc = () -> counter.value++; // 람다를 사용하여 counter 의 값을 증가시키는 Runnable 정의
        inc.run();

        return counter.value;
    }

}
