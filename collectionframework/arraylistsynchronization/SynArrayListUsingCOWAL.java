package collectionframework.arraylistsynchronization;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynArrayListUsingCOWAL {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> al= new CopyOnWriteArrayList<>();

        al.add("pen");
        al.add("pencil");
        al.add("copy");
        al.add("Eraser");
        al.add("Shapner");

        System.out.println("Displaying AL");

        Iterator<String> itr = al.iterator();

        while (itr.hasNext())
        {
            String str= itr.next();
            System.out.println(str);
        }
    }
}
