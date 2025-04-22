package java8programming.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class SortListOfStringInAlphabeticalOrder {
    public static void main(String[] args) {

        List<String> l = Arrays.asList("zz","dd","aa","f");

        System.out.println("List is : " );
        for (String s: l)
        {
            System.out.println(s);
        }
        l.sort((s1,s2)-> s1.compareToIgnoreCase(s2)    );

        System.out.println("After List : " + l);
    }
}
