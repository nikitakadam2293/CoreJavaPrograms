package collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class IntroToMap {
    public static void main(String[] args) {
        Map<String, Object> mapInt = new HashMap<>();

        mapInt.put(null,new Object());
        mapInt.put(null,new String("java"));
        mapInt.put(null,new Object() );
        mapInt.put(null,new Object() );
        mapInt.put(null,new Object() );
        mapInt.put(null,"Test");

        System.out.println("Map is  before : " + mapInt.get(null));  //Test

        mapInt.put(null, 10000);

        System.out.println("size of latest mapint is " +mapInt.size());  //1

        System.out.println("Map is aftre : " + mapInt.get(null));  //10000

    }
}
