package collectionframework.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.reflect.*;
public class RemoveEldestEntryMethod
{
    public static void main(String[] args) {

        final int max = 5;
        LinkedHashMap<String,String> lmap = new LinkedHashMap<>() {

            protected boolean removeEldestEntry(Map.Entry<String, String> e) {

                return  size()> max ;

            }
        };
        lmap.put("R", "Red");
        lmap.put("G", "Green");
        lmap.put("B", "Brown");
        lmap.put("O", "Orange");
        lmap.put("P", "Pink");

        System.out.println("Initial Entries : " + lmap);

        lmap.put("Z" , "ZZZZ");
        System.out.println("Adding Z  : " + lmap);

        lmap.put("K" ,"KKKK");
        System.out.println("Adding K  : " + lmap);


    }
}
