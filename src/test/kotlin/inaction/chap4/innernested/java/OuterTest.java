package inaction.chap4.innernested.java;

import org.junit.jupiter.api.Test;

class OuterTest {
    @Test
    void outerReferTest(){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.getOuterReference());

    }

}