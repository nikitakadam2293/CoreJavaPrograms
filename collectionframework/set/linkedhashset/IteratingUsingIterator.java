package collectionframework.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratingUsingIterator {

    public static void main(String[] args) {

        LinkedHashSet<String> l = new LinkedHashSet<>();

        l.add("One");
        l.add("two");
        l.add("three");
        l.add("four");

        System.out.println("Linked Hash Set  : " + l);

        Iterator<String> itr = l.iterator() ;
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
