package collectionframework.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RemoveValue {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key1", null);

        System.out.println(map.entrySet());  //[key1=null]

        System.out.println(map.containsValue("value1"));  //false

    }
}
