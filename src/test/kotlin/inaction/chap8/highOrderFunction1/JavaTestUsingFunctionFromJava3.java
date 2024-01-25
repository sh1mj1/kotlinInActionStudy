package inaction.chap8.highOrderFunction1;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class JavaTestUsingFunctionFromJava3 {
    @Test
    void testProcessTheAnswer() {
        UsingFunctionFromJava3Kt.processTheAnswer(number -> number + 1);

        UsingFunctionFromJava3Kt.processTheAnswer(
                new Function1<Integer, Integer>() {
                    @Override
                    public Integer invoke(Integer integer) {
                        return integer + 1;
                    }
                }
        );
    }

    @Test
    void testKotlinForEach() {
        List<String> strings = new ArrayList<>();
        strings.add("42");
        CollectionsKt.forEach(strings, s -> {
            System.out.println(s);
            return Unit.INSTANCE;
        });
    }
}
