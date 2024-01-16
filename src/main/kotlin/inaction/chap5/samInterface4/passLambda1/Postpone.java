package inaction.chap5.samInterface4.passLambda1;

public class Postpone {
    static void postponeComputation(int delay, Runnable computation) {
        computation.run();
        System.out.println("구현 생략 " + delay);
    }
}
