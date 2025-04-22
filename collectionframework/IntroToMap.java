package collectionframework;

import java.util.*;

public class IntroToMap {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        Set<String> set =new HashSet<>();

        Map<String,Integer> map=new HashMap<>();
        map.put("Test1",123);
        map.put("Test2",123);

        map.put("Test3",123);
     //   System.out.println("Value from map : "+ map.get("Test3"));   // 123

        map.put("Test3",456);
       // System.out.println("Value from map :: "+ map.get("Test3"));   // 456

        map.put("Test3",789);
        System.out.println("Value from map ::: "+ map.get("Test3"));   //789


        System.out.println("Value from map "+ map.get("Test1"));  //123
        System.out.println("Value from map "+ map.get("Test3"));   //789
        System.out.println("Value from map "+ map.get("Test5"));    //null


        System.out.println("Size of map is  "+map.size());


       //Integer value =  map.get(1234);//null


        Integer value =  map.get("Test1");
        System.out.println(value);

        Map<String,Object> mapInt = new HashMap<>();
        mapInt.put(null,new Object());
        mapInt.put(null,new String("java"));
        mapInt.put(null,new Object());
        mapInt.put(null,new Object());
        mapInt.put(null,new Object());
        mapInt.put(null,"Test");
        System.out.println("===="+mapInt.get(null)); //Test

        mapInt.put(null,10000);

        System.out.println("Size of latest mapInt is "+ mapInt.size()); //1

        System.out.println("----"+mapInt.get(null));







    }
}
