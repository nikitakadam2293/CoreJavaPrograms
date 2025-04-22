package collectionframework.set;

import java.util.HashSet;
import java.util.Set;

public class IteratingUsingForEach1_8 {

    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        s.add("Orange");
        s.add("Red");
        s.add("Blue");
        s.add("Yellow");
        s.add("Green");

        System.out.println("Set is  :  "+s);

        s.forEach(System.out::println);

    }



}
