package inaction.chap5.lambda_capture1_4

import org.junit.jupiter.api.Test

class CaptureNonFinalTest {
    @Test fun kotlinCaptureNonFinal() = assert(KotlinCaptureNonFinal().captureNonFinal() == 1)

    @Test fun kotlinCaptureNonFinal2() = assert(KotlinCaptureNonFinal2().captureNonFinal() == 1)

    @Test fun javaCaptureNonFinal() = assert(JavaCaptureNonFinal().captureNonFinal() == 1)
}