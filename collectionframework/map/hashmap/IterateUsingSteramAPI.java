package collectionframework.map.hashmap;

import java.util.HashMap;

public class IterateUsingSteramAPI {
    public static void main(String[] args) {

        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("India", " Delhi");
        hmap.put("USA", " Washington, D.C.");
        hmap.put("Australia", " Canberra");
        hmap.put("New Zealand", " Wellington");
        hmap.put("Switzerland", " Bern");

        System.out.println("HashMAp is : " + hmap);

        hmap.entrySet().stream().forEach(entry-> {
            System.out.println("Key : " + entry.getKey() + "  Value : " +entry.getValue());
        });
    }
}
