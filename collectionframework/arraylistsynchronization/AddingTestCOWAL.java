package collectionframework.arraylistsynchronization;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AddingTestCOWAL {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();

        al.add("A");
        al.add("B");
        al.add(null);
        al.add("D");
        al.add("E");
        al.add("H");

        System.out.println(al);

        List<String> synlist = Collections.synchronizedList(al);

        Iterator<String> itr =synlist.iterator();

        while (itr.hasNext())
        {
            al.set(5,"F");  // It will not throw ConcurrentModificationException during Iteration.

            String str = itr.next();
            System.out.println(str);
        }

        System.out.println(al);
    }
}
