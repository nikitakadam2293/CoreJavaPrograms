package collectionframework.arraylistiteratingway;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class UsingListIterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("first");
        al.add("second");
        al.add("third");
        al.add("four");
        al.add("five");

        System.out.println("Array list is : " +al);

        ListIterator listIterator = al.listIterator();

        System.out.println("Iteration in forword direction :");
        while (listIterator.hasNext())
        {
           // System.out.println(listIterator.next());   //also work
           Object o = listIterator.next();
           String str =(String)  o;
             System.out.println(str);
        }

        System.out.println("Iteration in Backword direction :");

        while (listIterator.hasPrevious())
        {
            Object o = listIterator.previous();
            String str1 = (String) o;
            System.out.println(str1);
        }
    }
}
