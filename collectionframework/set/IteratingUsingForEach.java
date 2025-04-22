package collectionframework.set;

import java.util.HashSet;
import java.util.Set;

public class IteratingUsingForEach {

    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        s.add("Orange");
        s.add("Red");
        s.add("Blue");
        s.add("Yellow");
        s.add("Green");

        System.out.println("Set is  :  "+s);

        for (String str : s)
        {
            System.out.println(str);
        }
    }
}
