package collectionframework.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AddAndSetMethod {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("list : " + list);  //list : [A, B, C, D]


        ListIterator<String> listIterator = list.listIterator();
        System.out.println("Forword Direction : ");
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());

            /*
            *   A
                B
                C
                D
*/
        }

        listIterator.add("E");  //After Adding : [A, B, C, D, E]

        //   listIterator.set("Z");  //After Adding : [A, B, C, Z]


        System.out.println("After Adding : " + list); //After Adding : [A, B, C, D, E]


        System.out.println("=========================================");

        System.out.println("Backword Direction : ");

        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
            /*
            Backword Direction :
                E
                D
                C
                B
                A
                */
        }

        //listIterator.add("L");  ////After Backword : [L, A, B, C, D, E]  // L start first bcz cursor at
        // that time first position

        listIterator.set("N");  //After Backword : [N, B, C, D, E]

        System.out.println("After Backword : "+ list); //After Backword : [N, B, C, D, E]



    }
}
