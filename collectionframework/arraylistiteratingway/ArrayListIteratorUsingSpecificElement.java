package collectionframework.arraylistiteratingway;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIteratorUsingSpecificElement {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<=9; i++)
        {
            al.add(i);
        }
        System.out.println( " Prnt all element : +" +al);

        ListIterator<Integer> litr = al.listIterator(2);

        while (litr.hasNext())
        {
            System.out.println("Print after : " +  litr.next());
        }

        System.out.println("Backword direction");
        while (litr.hasPrevious())
        {
            al.add(20);
            Integer itr1 = litr.next();
            System.out.println(itr1);
        }
    }
}
