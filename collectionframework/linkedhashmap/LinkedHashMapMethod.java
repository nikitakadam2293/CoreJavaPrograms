package collectionframework.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapMethod {
    public static void main(String[] args) {

        LinkedHashMap<String ,Integer> l = new LinkedHashMap<>();

        System.out.println("Size : " + l.size());
        System.out.println("IsEmpty : " + l.isEmpty());

        l.put("one" , 1);
        l.put("two" , 2);
        l.put("three" , 3);
        l.put("four" , 4);
        l.put("null",null);

        System.out.println("Linked Hash Map : " + l);



        
    }
}
