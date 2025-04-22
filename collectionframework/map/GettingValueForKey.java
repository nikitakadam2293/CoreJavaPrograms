package collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class GettingValueForKey {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("V", "Violet");
        map.put("I", "Indigo");
        map.put("B", "Blue");
        map.put("G", "Green");
        map.put("Y", "Yellow");
        map.put("O", "Orange");
        map.put("R", "Red");

        String s = map.get("V");
        System.out.println("Getting value for  V : " + s);  //Getting value for  V : Violet

        boolean chechKeyPresent = map.containsKey("B");
        System.out.println("chech Key is Present or not : " + chechKeyPresent );   //chech Key is Present or not : true

        boolean chechValuePresent = map.containsValue("Brown");
        System.out.println("Check value is present : " +chechValuePresent);  //Check value is present : false


    }
}
