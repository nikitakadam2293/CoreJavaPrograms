package collectionframework.arraylistiteratingway;

import java.util.ArrayList;
import java.util.Collections;

public class UsingWhileLoop {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(20);
        al.add(25);
        al.add(null);
        al.add(30);
        al.add(25);

        System.out.println(al);

        System.out.println("Iteration using while loop : ");

        int i=0;
        while (al.size()> i)
        {
            Integer itr = al.get(i);
            System.out.println(itr);
            i++;
        }


    }
}
