package collectionframework.arraylistiteratingway;

import java.util.ArrayList;
import java.util.Iterator;

public class ReverseAL {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        System.out.println("Al : " +al);

        int size = al.size();

        System.out.println("size " + size);
        for (int i = size-1; i>=0; i-- )
        {
            System.out.print(al.get(i)  + "  ");
        }


    }
}
