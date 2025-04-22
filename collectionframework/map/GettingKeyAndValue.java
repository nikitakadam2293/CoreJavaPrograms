package collectionframework.map;

import java.util.*;

public class GettingKeyAndValue {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("B" , "A");
        map.put("D" , "B");
        map.put("A" , "C");
        map.put("C" , "D");
        map.put("E" , "E");
      //  map.put("E" , "Z");

        Set<String>  keys = map.keySet();
        System.out.println("Set of Key is : " + keys);

        Collection<String> value = map.values();
        System.out.println("Value is : "+ value);
    }
}
/*Set of Key is : [A, B, C, D, E]
       Value is : [C, A, D, B, E]
*/

