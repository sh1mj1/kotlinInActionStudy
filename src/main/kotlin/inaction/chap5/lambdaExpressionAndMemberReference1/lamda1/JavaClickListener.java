package inaction.chap5.lambdaExpressionAndMemberReference1.lamda1;


import java.awt.*;

public class JavaClickListener {
    public void setListener(Button button) {
        button.addActionListener(e -> System.out.println("수행할 동작을 구현하자"));
    }
}
