package collectionframework.linkedhashmap;

import java.util.LinkedHashMap;

public class LHMScenario {

    public static void main(String[] args) {

        LinkedHashMap<String,String> lmap = new LinkedHashMap<>(16,0.75f,true);
        lmap.put("En", "English");
        lmap.put("Hi", "Hindi");
        lmap.put("Ta", "Tamil");
        lmap.put("De", "German");
        lmap.put("Fr", "French");

        System.out.println("Linked Hash Map : " + lmap);
        System.out.println("Get Hi : " + lmap.get("Hi"));

        System.out.println("Get En : " + lmap.get("En"));
        System.out.println("Linked Hash Map is : " + lmap);

        System.out.println("+++++++++++++++++++++++");

        LinkedHashMap<String,String> lmap2 = new LinkedHashMap<>(16,0.75f,false);

        lmap2.put("En", "English");
        lmap2.put("Hi", "Hindi");
        lmap2.put("Ta", "Tamil");
        lmap2.put("De", "German");
        lmap2.put("Fr", "French");

        System.out.println("Linked Hash Map : " + lmap2);

        System.out.println("Get Hi " + lmap2.get("Hi"));

        System.out.println("Get En : " + lmap2.get("En"));
        System.out.println("Gettingggggg  " + lmap2);

        System.out.println("++++++++++++++++++++++");

        System.out.println(lmap.remove("De"));
        System.out.println("After remove :  " + lmap);

        System.out.println(lmap.replace("De","kkkkkk"));  // null

        System.out.println(lmap.replace("Fr","++++++"));
        System.out.println("After Replace : " + lmap);

        System.out.println("Contains value  " + lmap.containsValue("Tamil")); //Contains value  true


    }
}
