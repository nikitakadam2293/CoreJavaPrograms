package collectionframework.map.treemap;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

    public enum Days{
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
    }
    public static void main(String[] args) {

        EnumMap<Days,String> emap = new EnumMap<Days, String>(Days.class);

        emap.put(Days.Sunday, "One");
        emap.put(Days.Monday, "two");
        emap.put(Days.Tuesday, "three");
        emap.put(Days.Wednesday, "four");
        emap.put(Days.Thursday, "five");
        emap.put(Days.Friday, "six");
        emap.put(Days.Saturday, "seven");

        System.out.println("emap is  : "+ emap);
        System.out.println("Entry : "+ emap.entrySet());
        System.out.println("Key : " + emap.keySet());
        System.out.println("Value : " + emap.values());

        System.out.println();
        System.out.println("Iterating Map : Using Entry");
        Iterator<Map.Entry<Days,String>> itr = emap.entrySet().iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("Iterating Map Using Key");

        Iterator<Days> key = emap.keySet().iterator();
        while (key.hasNext())
        {
            System.out.println(key.next());
        }
        System.out.println();
        System.out.println("Iterating map using value : ");

        Iterator<String> value = emap.values().iterator();
        while (value.hasNext())
        {
            System.out.println(value.next());
        }


    }
}
