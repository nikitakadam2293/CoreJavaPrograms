package collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class IteratingUsingForEachLoop {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"abc");
        map.put(2,"def");
        map.put(4,"ghi");
        map.put(7,"jkl");

        System.out.println("Map is : " + map);

        System.out.println("Iterating map both key and value ");

        for(Map.Entry<Integer,String> str : map.entrySet())
        {
            System.out.println("Key is : "+ str.getKey() + " value is : " + str.getValue());
        }

        System.out.println();
        System.out.println("Iterating map only using key : ");

        for(Integer i : map.keySet())
        {
            System.out.println(" Key is : " + i);
        }

        System.out.println();
        System.out.println("Iterating map using value : ");

        for(String s : map.values())
        {
            System.out.println("Value is : " + s);
        }


    }
}
