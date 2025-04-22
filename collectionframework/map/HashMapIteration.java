package collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("T", 101);
        map.put("M", 301);
        map.put("W", 801);
        map.put("P", 401);
        map.put("J", 401);
        map.put("N", 201);
        map.put("Q", 301);
        map.put("Z", 301);
        map.put("Z", 30999);

        // i want to iterate over this map and print key and value
        // expected output  : key is T and value is 101

        for(Map.Entry<String,Integer>  maps: map.entrySet())
        {
            System.out.println("Key is " +maps.getKey() + " and value is " + maps.getValue());
        }
    }
}
