package collectionframework.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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


        Iterator<Integer>  itr = hmap.keySet().iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


        if(hmap.keySet() == null)
        {
            System.out.println("nullll");
            System.out.println(hmap.hashCode());
        }
    }
}
