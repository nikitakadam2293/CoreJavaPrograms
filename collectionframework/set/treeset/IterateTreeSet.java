package collectionframework.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class IterateTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(25);
        ts.add(80);
        ts.add(05);
        ts.add(100);
        ts.add(90);
        System.out.println("Sorted TreeSet:");

        Iterator<Integer> itr = ts.iterator();

        System.out.println("Iterating TreeSet using Iterator");
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
