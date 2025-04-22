package collectionframework.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomTreeMapWithNullAndSortedOrder {


    public static void main(String[] args) {

        Comparator<String> cm = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(o1 == null && o2== null)
                {
                    return 0;
                }
                if(o1==null)
                {
                    return -1;
                }
                if(o2==null)
                {
                    return 1;
                }
                return o1.compareTo(o2);
            }
        };

        TreeMap<String,Integer> map = new TreeMap<>(cm);
        map.put("banana",2);
        map.put("apple",1);
        map.put(null,9);
        map.put("Cherry",4);

        System.out.println("Iterating map");

        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println("Key :   " +entry.getKey()+ "  Value : " + entry.getValue());
        }
    }
}
