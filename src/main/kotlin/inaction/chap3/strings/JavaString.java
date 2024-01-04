package inaction.chap3.strings;

public class JavaString {
    public void splitString1() {
        String str = "12.345-6.A";
        String[] strings = str.split(".");

        for (String string : strings) {
            System.out.println(string); // 아무것도 출력되지 않음
        }
    }

    public void splitString2() {
        String str = "12.345-6.A";
        String[] strings = str.split("\\.");

        for (String string : strings) {
            System.out.println(string); // 의도대로 출력됨
        }
    }
}
