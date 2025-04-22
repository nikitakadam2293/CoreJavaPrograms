package collectionframework.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveMethod {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<=8; i++)
        {
            al.add(i);
        }
        System.out.println("Array List is : " +al);

        Iterator<Integer> a = al.iterator();
        while (a.hasNext())
        {
            Integer i = a.next();// int i = a.next(); //When you assign an Integer object to a primitive int variable, Java automatically unboxes it (converts the Integer to int).
           // System.out.println(i);

            if(i% 2 !=0) {
                a.remove();
            }

        }
        System.out.println("Remove : " +al);


       /* ArrayList<Integer> al= new ArrayList<>();
        for(int i=0; i<=8; i++)
        {
            al.add(i);
        }
        System.out.println("Array List : " +al);

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext())
        {
            Integer it=  itr.next();
           // System.out.println ("it : "+it);

            if(it%2 !=0)
            {
                itr.remove();
            }

        }
        System.out.println("Iterator is after removing : " + al);*/

    }
}
