package collectionframework.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionSorting1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("apple");
        al.add("banana");
        al.add("grapes");
        al.add("pineapple");
        al.add("1grapes");
        al.add("grapes1");

        System.out.println("Array List is : " + al);

        Collections.sort(al);

        System.out.println(" After SortingArray List is : " + al);  // After SortingArray List is : [1grapes, apple, banana, grapes, grapes1, pineapple]

        System.out.println("=====");

        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("banana");
        ll.add("grapes");
        ll.add("pineapple");
        ll.add("1grapes");
        ll.add("grapes1");

        System.out.println("Linked List is : " + ll);

        Collections.sort(ll);

        System.out.println(" After Sorting Linked List is : " + ll);

    }
}
