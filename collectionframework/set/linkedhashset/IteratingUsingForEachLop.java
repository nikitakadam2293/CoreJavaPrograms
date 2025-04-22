package collectionframework.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.ListIterator;

public class IteratingUsingForEachLop {

    public static void main(String[] args) {

        LinkedHashSet<String> l = new LinkedHashSet<>();

        l.add("One");
        l.add("two");
        l.add("three");
        l.add("four");

        System.out.println("LinkedHashSet : " +l);

        System.out.println();
        System.out.println("Iterating Using For Each Loop");
        for (String s: l)
        {
            System.out.println(s);
        }



    }
}
