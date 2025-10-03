package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArraySize {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list size : " +list.size());
        list.remove(1);

        System.out.println("list size after remove : " +list.size());

        System.out.println("========");
        String s1 = "bhag";
        String s2 = "nik";

         s2 = s1;
        System.out.println ("mmm"+s2);




        System.out.println("hhh "+ s1.replaceAll("nik",s2)) ;
        System.out.println(s2.replaceAll("bhag",s1));

    }
}
