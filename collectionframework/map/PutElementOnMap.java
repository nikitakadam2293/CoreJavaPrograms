package collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class PutElementOnMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        boolean isEmpty = map.isEmpty();
        System.out.println("Map isEmpty Method : " + isEmpty);

        map.put(101, "One");
        map.put(102,"Two");
        map.put(103,"Three");
        map.put(104,"Four");

        System.out.println("Map is : "+map);
        System.out.println("Size of map : "+ map.size());


        Map<Integer, String>  map2 = new HashMap<>();
        map2.put(201,"Hello");
        map2.put(202, "java");

        System.out.println("Map two is : "+ map2);

        map.putAll(map2);

        System.out.println("Adding map and map2 : "+ map);

        System.out.println( map.remove(1));  // null remove that key wich is not present

        System.out.println("After Removing : "+map);  // {101=One, 102=Two, 103=Three, 104=Four, 201=Hello, 202=java}

        System.out.println(map.remove(102, "Two"));  //  true
        System.out.println(map);  // {101=One, 103=Three, 104=Four, 201=Hello, 202=java}

        map.replace(101,"OOOOne");

        System.out.println("Replacing element at specified index of map : " +map);

        map.replace(103,"Three" , "TTTThree");
        System.out.println("Updated Map is : " + map);

    }
}
