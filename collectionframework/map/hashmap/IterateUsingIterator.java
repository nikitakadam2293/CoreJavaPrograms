package collectionframework.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateUsingIterator {

    public static void main(String[] args) {
        HashMap<Character,String> hmap = new HashMap<>();

        hmap.put('D' ,"Apple");
        hmap.put('B' ,"Ball");
        hmap.put('H' ,"Horse");
        hmap.put('Z' ,"Zebra");

        System.out.println("HashMap : " + hmap);

        System.out.println();
        System.out.println("Iterating HashMAp using Both key and value");
        Iterator<Map.Entry<Character,String>>  itr  = hmap.entrySet().iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("============================");
        itr.remove();
        System.out.println( "Remo both key and valu" + hmap.entrySet());  //[B, D, H]

        System.out.println("======================================");
        System.out.println("");

        System.out.println("Iterating Key : ");
        Iterator<Character> itrKey = hmap.keySet().iterator();

        while (itrKey.hasNext())
        {
            System.out.println(itrKey.next());
        }

        System.out.println();
        System.out.println("Iterating Value ");


        System.out.println("**********************************************");

        itr.remove();
        System.out.println("Remove key : " + hmap.keySet());

        System.out.println("**********************************************");


        Iterator<String> itrValue = hmap.values().iterator();
        while (itrValue.hasNext())
        {
            System.out.println(itrValue.next());
        }

    }
}
