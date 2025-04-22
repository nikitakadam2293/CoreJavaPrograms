package collectionframework.map;

import java.util.*;

public class IntroToMap1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        Map<String,Integer> map = new HashMap<>();

        map.put("Test1", 123 );
        // calculate hash code of the key Test1
        // pass this hashcode to hash method which gives some int value => This function is implemented
        //so that it overcomes poorly implemented hashCode() method.
        //After calculating the hashcode of the key, it calls indexFor() method by passing the hashcode of the
        // key and length of the table[] array
        // this method returns the index in the table[] array for that particular key-value pair

        map.put("Test2", 123 );
        map.put("Test3", 123 );

    }
}
