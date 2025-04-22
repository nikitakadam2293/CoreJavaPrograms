package collectionframework.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("Z");
        list.add("P");
        list.add("O");


        System.out.println("Before Sorting " +list);

        //utility class => static method
        Collections.sort(list);
        System.out.println(" after sorting " +list );

    }
}
