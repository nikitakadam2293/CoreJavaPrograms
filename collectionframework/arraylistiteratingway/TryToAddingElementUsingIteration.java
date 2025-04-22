package collectionframework.arraylistiteratingway;

import java.util.ArrayList;
import java.util.Iterator;

public class TryToAddingElementUsingIteration {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Loin");
        al.add("Tiger");
        al.add("Elephent");
        al.add("Bear");

        Iterator<String> itr = al.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());

            boolean b= al.add("Leopard");
            System.out.println(b);
        }
    }
}
/*
Loin
true
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
	at collectionframework.arraylistiteratingway.TryToAddingElementUsingIteration.main(TryToAddingElementUsingIteration.java:20)
*/