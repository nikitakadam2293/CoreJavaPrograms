package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListAddAllMethod {
    public static void main(String[] args) {

        List<String> list1 =new ArrayList<String>();
        list1.add("Apple");
        list1.add("mango");
        list1.add("orange");
        list1.add("grapes");
        System.out.println("List 1 : " +list1);


        List<String> list2 =new ArrayList<String>();
        list2.add("11");
        list2.add("12");
        list2.add("13");
        System.out.println("List 2 : " +list2);

        list1.addAll(2,list2);
        System.out.println("After Adding : "+list1);


        //indexOf element

        System.out.println("Index of grapes : " +list1.indexOf("grapes")); //Index of grapes : 6

        System.out.println("Index of grapes : " +list1.indexOf("grap")); //Index of grapes : -1

        // get() method

        System.out.println("Get Element  0 index :  " +list1.get(0)); //Get Element  0 index :  Apple

        System.out.println("Get Element  3 index :  " +list1.get(3)); //Get Element  0 index :  12


        //System.out.println("Get Element  7 index :  " +list1.get(7)); //IndexOutOfBoundsException occure


    }
}
