package collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratingUsingIterator {

    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        s.add("Orange");
        s.add("Red");
        s.add("Blue");
        s.add("Yellow");
        s.add("Green");

        System.out.println("Set is : " + s);

        Iterator<String> itr = s.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
          //  s.add("ooooo");  //ConcurrentModificationException
        }

        itr.remove();
        System.out.println(s);
    }
}
