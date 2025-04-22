package java8programming.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingStringLowerAndUpperCase {

    public static void main(String[] args) {

        String arr[] = {"Red", "Green", "Blue", "PINK"};
        List<String > l= new ArrayList<>(Arrays.asList(arr));


       /* for(String s : l)
        {
            System.out.println(l);
        }*/
        l.replaceAll(s->s.toLowerCase());

        System.out.println("List after lower case : " +l);

        System.out.println();

        l.replaceAll(ss->ss.toUpperCase());
        System.out.println("List after upper case : " +l);


    }
}
