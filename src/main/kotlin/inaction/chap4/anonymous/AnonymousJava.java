package inaction.chap4.anonymous;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnonymousJava {

    public void anonymous() {
        Window window = new Window(new Frame("title"));
        window.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
            // ...
        });
    }

    public void countClicks(Window window) {
        int clickCount = 0;
        window.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                clickCount++; // Variable 'clickCount' is accessed from within inner class, needs to be final or effectively final
                super.mouseClicked(e);
            }
        });
    }
}
