package inaction.chap4.object.normal;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonJavaTest {
    @Test
    void javaTestPerson() {
        List<Person> persons = Arrays.asList(new Person("Bob"), new Person("Alice"));
        persons.sort(Person.NameComparator.INSTANCE);
        assertEquals(Arrays.asList(new Person("Alice"), new Person("Bob")), persons);
    }


}
