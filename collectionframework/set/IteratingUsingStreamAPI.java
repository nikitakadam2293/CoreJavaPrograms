package collectionframework.set;

import java.util.HashSet;
import java.util.Set;

public class IteratingUsingStreamAPI {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        s.add("Orange");
        s.add("Red");
        s.add("Blue");
        s.add("Yellow");
        s.add("Green");

        System.out.println("Set is  :  "+s);

       // s.stream().forEach(System.out::println);   // also work

        s.stream().forEach(e->{
            System.out.println(e);
        });

    }
}
