package java8programming.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Multiplication
{
    void multiply(List<Integer> al);
}

public class MultiplyAndSumOfIntegerInList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,1,6,7,40);

        Multiplication multiplication = (l) ->
        {
            int result =0;

            int mult =1 ;

            for(int i=0;i<list.size();i++)
            {
                result = result+ list.get(i);
            }
            System.out.println("Addition " + result);

            System.out.println("============");

            for (int i =0; i<list.size(); i++)
            {
                mult = mult* list.get(i);
            }
            System.out.println("Multiplication : " + mult);

        };



        multiplication.multiply(list);

        //System.out.println(res);

    }
}
