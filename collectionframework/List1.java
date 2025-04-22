package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {

        List list1 =new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add("java");

        list1.add(4,50);
        list1.add(5,60);

        System.out.println("After adding : "+ list1);



    }

}
