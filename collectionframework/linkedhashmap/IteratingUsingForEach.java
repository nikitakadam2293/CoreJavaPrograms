package collectionframework.linkedhashmap;

import java.util.LinkedHashMap;

public class IteratingUsingForEach {

    public static void main(String[] args) {

        LinkedHashMap<Character,String> lmap = new LinkedHashMap<>();
        lmap.put('R', "Red");
        lmap.put('G', "Green");
        lmap.put('B', "Brown");
        lmap.put('O', "Orange");
        lmap.put('P', "Pink");

        System.out.println("Linked Hash Map ");

        lmap.forEach((k,v)->{
            System.out.println("Key : " + k + "  Value  : "+ v);
        });
    }
}
