package collectionframework.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("A" ,"Apple");
        map.put("B" ,"Ball");
        map.put("C" ,"Cat");
        map.put("D" ,"Dog");

        System.out.println("Iterating Map : ");
        Iterator<Map.Entry<String,String>>  itr = map.entrySet().iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("Iterating key only");

        Iterator<String> key = map.keySet().iterator();

        while (key.hasNext())
        {
            System.out.println(key.next());
        }

        System.out.println("Iterating map using value : ");

        Iterator<String> value = map.values().iterator();
        while(value.hasNext())
        {
            System.out.println(value.next());
        }

        System.out.println("Before Remove : "+ map);

        itr.remove();
        System.out.println("After remove : " + map);


     }
}
