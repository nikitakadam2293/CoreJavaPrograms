package java8programming.lambdaexpression;

import java.util.Arrays;
import java.util.List;

interface AverageLength{
    void averageLength(List<String> l);
}
public class AverageLengthOfStringInList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("first","second","third","four","fivllel");

        AverageLength averageLength =(l)->{

            int sum=0;

            for(int i=0; i< list.size(); i++)
            {
                String s=  list.get(i);
                sum = sum+ s.length();
            }
            System.out.println("Sum : " + sum);

            int avg = sum/list.size();
            System.out.println("Average is : "+ avg);
        };

        averageLength.averageLength(list);
    }
}
