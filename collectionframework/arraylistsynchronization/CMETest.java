package collectionframework.arraylistsynchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CMETest {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i=0; i<=10; i++)
        {
            al.add(i);
        }

        List<Integer> synlist= Collections.synchronizedList(al);

        synchronized (synlist)
        {
            Iterator<Integer> itr= synlist.iterator();
            while (itr.hasNext())
            {
                al.add(20);  // It will throw ConcurrentModificationException
                // because we cannot modify list during Iteration.

                System.out.println(itr.next());
            }
        }

    }
}
