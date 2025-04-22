package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeVsFailFast {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);

        Iterator<Integer> itr= integers.iterator();

        while (itr.hasNext())
        {
            Integer a = itr.next();   //ConcurrentModificationException
            integers.remove(a);  //Modifing collection => ConcurrentModificationException (CME)
        }


        /// //////////////

        List<Integer> integers1 = new CopyOnWriteArrayList<>();

        integers1.add(1);
        integers1.add(2);
        integers1.add(3);

        Iterator<Integer> itr1 = integers1.iterator();
        while (itr1.hasNext())
        {
            Integer a= itr1.next();  // It not give exception
            integers1.remove(a);

        }


    }

}
