package collectionframework;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedList1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");

        list.add(null);
        list.add(null);


        System.out.println(list);

        Set<String> set =new HashSet<>();

        set.add("E");
        set.add("G");
        set.add("H");
        set.add("A");
        set.add("F");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("D");
        set.add(null);
        set.add(null);
        System.out.println(set);


        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        System.out.println("Before : "+list2);

        list2.remove(2);
        System.out.println("After : "+list2);


    }
}
