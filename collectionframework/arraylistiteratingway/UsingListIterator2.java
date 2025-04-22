package collectionframework.arraylistiteratingway;

import java.util.ArrayList;
import java.util.ListIterator;

public class UsingListIterator2 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Nine");
        al.add("Five");
        al.add("Seven");
        System.out.println(al);

        ListIterator<String> itr =al.listIterator();

        while (itr.hasNext())
        {
            String str =  itr.next();

            if(str.equals("Nine"))
            {
                itr.remove();
                itr.add("NNNNNNNNNN");
                System.out.println( "add : " + al);
            }
            if(str.equals("Seven"))
            {
                itr.set("sssssssssss");
                System.out.println("Set : " + al);
            }


        }
    }
}
