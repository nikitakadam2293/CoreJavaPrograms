package collectionframework.listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorWithoutGeneric {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("apple");
        al.add("orange");
        al.add("banana");
        al.add("guava");
        al.add("pineapple");

        System.out.println("ArrayList : " + al);

        ListIterator litr = al.listIterator();

        while (litr.hasNext()) {
            Object o = litr.next();
            String str = (String) o;  //// Type casting.

            if (str.equals("orange")) {
                litr.remove();
                System.out.println("Remove  orange: " + al);

             }
            if(str.equals("guava"))
            {
                litr.add("grapes");
                System.out.println("add grapes after guava : " + al);

            }
            if(str.equals("apple"))
            {
                litr.set("pears");
                System.out.println("set pears on  place pineapple : " + al);

            }
        }
    }
}