package java8programming.lambdaexpression;

import java.util.Arrays;
import java.util.List;

interface FindLength
{
    void findLength(List<String> str);
}

public class FindLongestAndSmallestLengthOfString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple","banana","mango","pineapple");


        FindLength findLength = (s)->{


            String smalest =list.get(0);
            String longest = list.get(0);

            for(int i= 0; i<list.size();i++)
            {
                String current = list.get(i);
                if(current.length() > longest.length())
                {
                    longest = current;
                }
                if(current.length() < smalest.length() )
                {
                    smalest = current;
                }

            }
            System.out.println("Smallest : " +smalest+ " is : " + smalest.length());
            System.out.println("Longest : "+ longest + " is : " + longest.length());
        };

        findLength.findLength(list);


    }
}
