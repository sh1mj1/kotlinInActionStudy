package inaction.chap2;

public class Chap2MainJava {

    public static void main(String[] args) {
        Person person = new Person("Bob", true);
        System.out.println(person.getName());
        person.setMarried(false);
        System.out.println(person.isMarried());
    }
}
