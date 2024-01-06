package inaction.chap4.innernested.java;

import inaction.chap4.innernested.State;
import inaction.chap4.innernested.View;
import org.jetbrains.annotations.NotNull;

public class Button implements View {
    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {/* ... */}

    public static class ButtonState implements State {
        // 여기에 Button 에 대한 구체적인 정보를 추가
    }
}


class Outer {
    int field1 = 0;
    class Inner {
        int field1 = 1;
        Outer getOuterReference() {return Outer.this;}

        int getOuterField1() {return Outer.this.field1;}
    }
}
