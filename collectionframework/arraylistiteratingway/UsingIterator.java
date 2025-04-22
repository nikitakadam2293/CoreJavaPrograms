package collectionframework.arraylistiteratingway;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator
{
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Mango");
        al.add("Banana");
        al.add("Guava");
        al.add("Pineapple");
        System.out.println("Array List : " + al);

        Iterator<String> iterator= al.iterator();

        while (iterator.hasNext())
        {
            String str= iterator.next();
            System.out.println(str);

            if(str.equals("Pineapple"))
            {
                iterator.remove();
                System.out.println("After Removing : ");
                System.out.println(al);

            }
        }
    }
}
