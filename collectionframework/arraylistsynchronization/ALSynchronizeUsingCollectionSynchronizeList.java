package collectionframework.arraylistsynchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ALSynchronizeUsingCollectionSynchronizeList {
    public static void main(String[] args) {

        // Non Synchronize AL object

        List<String> l = new ArrayList<String>();

        l.add("apple");
        l.add("orange");
        l.add("banana");
        l.add("pineapple");
        l.add("Gauva");

        // Synchronizing ArrayList in Java.

        List<String> synlist = Collections.synchronizedList(l);

        synchronized (synlist)
        {
            Iterator<String> itr= synlist.iterator();

            while (itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
    }



}
