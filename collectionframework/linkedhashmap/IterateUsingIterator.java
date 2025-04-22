package collectionframework.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class IterateUsingIterator {

    public static void main(String[] args) {

        LinkedHashMap<Character,String> lmap = new LinkedHashMap<>();

        lmap.put('R', "Red");
        lmap.put('G', "Green");
        lmap.put('B', "Brown");
        lmap.put('O', "Orange");
        lmap.put('P', "Pink");

        System.out.println("Entries in LinkedHashMap : " + lmap); //Entries in LinkedHashMap : {R=Red, G=Green, B=Brown, O=Orange, P=Pink}

        System.out.println("Iterating Linked HashMap");
        Iterator<Map.Entry<Character,String>> itr = lmap.entrySet().iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


        System.out.println("Iterating Using key  : ");

        Iterator<Character> itr1 = lmap.keySet().iterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

        System.out.println("Iterating Using Value ");
        Iterator<String> itr2 = lmap.values().iterator();
        while (itr2.hasNext())
        {
            System.out.println(itr2.next());
        }


    }
}
