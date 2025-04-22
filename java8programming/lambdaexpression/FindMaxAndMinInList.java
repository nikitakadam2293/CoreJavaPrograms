package java8programming.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

interface FindMaxMin
{
    void maxMinReturn(List<Integer> al);
}


public class FindMaxAndMinInList {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(111,23,10,4,7,20);


        FindMaxMin findMaxMin = (al)->
        {
            int min = al.get(0);

            for (int i= 1; i<al.size(); i++)
            {
                if(al.get(i)<min)
                {
                    min = al.get(i);

                }
            }
            System.out.println(min);

            System.out.println("=======");
            System.out.println("=======");

            int max = al.get(0);

            for(int i=1; i<al.size(); i++)
            {
                if(al.get(i) > max)
                {
                    max= al.get(i);
                }
            }
            System.out.println("Max is : " + max);


        };


        findMaxMin.maxMinReturn(a);







//        List<Integer> al = Arrays.asList(111,23,10,4,7,20);

        //ArrayList<Integer> al = new ArrayList<>(list);

       /* int min = al.get(0);

        for (int i= 1; i<al.size(); i++)
        {
            if(al.get(i)<min)
            {
                min = al.get(i);

            }
        }
        System.out.println(min);*/

       /* System.out.println("=======");

        List<Integer> ll = Arrays.asList(3,44,22,1,66,77,99,44,22);

        int max = ll.get(0);

        for(int i=1; i<ll.size(); i++)
        {
            if(ll.get(i) > max)
            {
                max= ll.get(i);
            }
        }
        System.out.println("Max is : " + max);*/

    }
}
