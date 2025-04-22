package collectionframework.map.hashmap;

import java.util.HashMap;

public class NullKeyOfHashMap {

    public static void main(String[] args) {

        //HashMap<Integer,Byte> hmap = new HashMap<>();;
       // hmap.put(1,(byte) 10);


        HashMap<Integer,Integer> hmap = new HashMap<>();;

        hmap.put(null,11);

        System.out.println(hmap);
        System.out.println(hmap.hashCode());

        Integer key = null;

        int hash = (key==null) ? 0 : key.hashCode();
        System.out.println("HashCode is : " + hash);
    }
}
