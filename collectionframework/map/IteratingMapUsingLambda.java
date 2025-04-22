package collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class IteratingMapUsingLambda {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("India" , "Delhi");
        map.put("USA", " Washington, D.C.");
        map.put("Australia", " Canberra");
        map.put("New zealand", " Wellington");
        map.put("Switzerland", " Bern");

        System.out.println("Map is : " + map);

        System.out.println("==========");

        map.forEach((k,v) -> System.out.println("Key is : " + k + " AND   Value is : " + v));

        System.out.println("===================");
        map.forEach((key, value) ->{

            System.out.println("Key : " + key) ;
            System.out.println("Value : " + value);
        });

    }
}
