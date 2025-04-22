package java8programming.lambdaexpression;

import java.util.Arrays;
import java.util.List;

interface FindOddAndEven
{
    void oddAndEven(List<Integer> n);
}
public class EvenAndOddNoFindInList {

//    List<Integer> list = Arrays.asList(1,22,3,109,3);

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,3);
        FindOddAndEven findOddAndEven = (n)->{

            int sum=0;
            int odd =0;

            System.out.println("Find Even and Odd  ");
            for(int i =0; i<list.size(); i++)
            {
                if(list.get(i) % 2 == 0)
                {
                    sum=  sum +  list.get(i) * list.get(i) ;
                }
                else
                {
                    odd= odd +list.get(i) * list.get(i);
                }
            }
            System.out.println("Enen Number sum is : " +sum);
            System.out.println("Odd Number sum is : " + odd);
        };

        findOddAndEven.oddAndEven(list);

    }
}
