package collectionframework.comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomClassSorting {
    public static void main(String[] args) {

        List<Person> list  = new ArrayList<>(Arrays.asList(
                new Person("abc", 30, 60.7),
                new Person("pqr",88,90.4),
                new Person("xyz", 77,44.6)

        ));

        System.out.println("Original List : "+ list);

       // Arrays.sort(list);
        // Collections.sort(list);
        System.out.println("Sorted list : " + list);
    }
}

class Person
{
    public Person(String xyz, int i, double v) {
    }
}