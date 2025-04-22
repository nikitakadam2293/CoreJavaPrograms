package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class IntroToCollection {
    public static void main(String[] args) {
        List list=new ArrayList();
     //   int a=100;
        list.add(100);
        list.add("test");
        list.add(true);

       /* for(Object obj : list)
        {
            Integer i= (Integer) obj; //type casting =>down casting
            System.out.println(i);
        }*/

        for(Object obj : list)
        {
            if(obj instanceof String)
            {
                String s =(String)  obj;
                System.out.println(s);
            }

            if(obj instanceof Integer)
            {
                Integer i=(Integer) obj;
                System.out.println(i);
            }
        }

    //    list.remove(0);
        System.out.println(list);
        int size = list.size();
        System.out.println("size : "+size);  //size : 3


        boolean isEmpty= list.isEmpty();
        System.out.println("isEmpty " +isEmpty); //isEmpty false








        //int arr[]={100,"te",false};
    }
}
