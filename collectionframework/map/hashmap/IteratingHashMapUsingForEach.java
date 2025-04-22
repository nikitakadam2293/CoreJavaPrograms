package collectionframework.map.hashmap;

import java.util.HashMap;

public class IteratingHashMapUsingForEach {
    public static void main(String[] args) {

        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("India", " Delhi");
        hmap.put("USA", " Washington, D.C.");
        hmap.put("Australia", " Canberra");
        hmap.put("New Zealand", " Wellington");
        hmap.put("Switzerland", " Bern");

        System.out.println("HashMAp is : " + hmap);

        System.out.println();
        System.out.println("Iterating Using ForEach : ");

        hmap.forEach((k,v)->{
            System.out.println("Key : " + k+ " Value : " + v);
        });


    }
}
