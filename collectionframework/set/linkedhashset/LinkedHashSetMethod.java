package collectionframework.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetMethod {
    public static void main(String[] args) {

        LinkedHashSet<String> l = new LinkedHashSet<>();

        l.add("Red");
        l.add("Green");
        l.add("Yellow");
        l.add("Blue");
        l.add("Orange");

        System.out.println("Linked HashSet : " + l); //Linked HashSet : [Red, Green, Yellow, Blue, Orange]


        l.add("Blue");
        l.add("Orange");
        l.add("Orangeoo");

        l.add(null);
        l.add(null);
        System.out.println("Linked HashSet : " + l);  //Linked HashSet : [Red, Green, Yellow, Blue, Orange, Orangeoo,null]

        LinkedHashSet<String> l2 = new LinkedHashSet<>();

        l2.add("LLLLLl");
        l2.add("MMMM");
        System.out.println(l.addAll(l2));  //true

      /*  System.out.println("========================================");

        System.out.println(l.retainAll(l2));  //true
        System.out.println(l);

        System.out.println("========================================");*/


        System.out.println("Adding l l2 : " + l); //Adding l l2 : [Red, Green, Yellow, Blue, Orange, Orangeoo, null, LLLLLl, MMMM]
        System.out.println("Remove Set 2  : l2  remove : " + l.removeAll(l2));  //true

        System.out.println(l);  //[Red, Green, Yellow, Blue, Orange, Orangeoo, null]

        System.out.println(l.retainAll( l2));  //true
        System.out.println(l);  //[]
        //retainAll() = retains only the elements in the ArrayList that are common to another specified collection


    }
}
