package collectionframework.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RemoveMethod {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("List : " + list);  //List : [A, B, C, D]


        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Forword Direction : ");

        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
            /*  A
                B
                C
                D
                */
        }

        System.out.println("Before : " + list );  //Before : [A, B, C, D]

        listIterator.remove();

        System.out.println("After : " + list );  //After : [A, B, C]

        System.out.println("==========================================");

        System.out.println("Backword Direction : ");

        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());

            /*Backword Direction :
                C
                B
                A*/
        }
        listIterator.remove();

        System.out.println("After : "+ list);  //After : [B, C]

    }
}
