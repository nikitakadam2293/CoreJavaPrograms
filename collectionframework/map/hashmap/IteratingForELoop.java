package collectionframework.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IteratingForELoop {
    public static void main(String[] args) {

        HashMap<Integer,String> hmap = new HashMap<>();

        hmap.put(1,"one");
        hmap.put(3,"three");
        hmap.put(5,"five");
        hmap.put(0,"zero");

        System.out.println(hmap);

        System.out.println("Iterating both key and value");

        for (Map.Entry<Integer,String> s : hmap.entrySet())
        {
            System.out.println("Key is : " + s.getKey() + "  Value is : " + s.getValue());
        }

        System.out.println("Iterating Key : ");
        for (Integer i : hmap.keySet())
        {
            System.out.println(i);
        }

        System.out.println("Iterating Value : ");
        for(String s : hmap.values())
        {
            System.out.println(s);
        }

        System.out.println("++++++++++++++++++++++++++++");

        System.out.println(hmap.entrySet());

      Map.Entry<Integer,String> itr= hmap.entrySet().iterator().next();
      int hash = itr.hashCode();
        System.out.println(hash);  //3735208

        System.out.println(hmap.hashCode() + "  hashcode of hashmap :");  //117328227  hashcode of hashmap :

    }
}
