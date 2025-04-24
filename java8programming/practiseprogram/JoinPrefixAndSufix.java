package java8programming.practiseprogram;

// 6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinPrefixAndSufix {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("one","seven","nine","two");

        String  joinString = list.stream().collect(Collectors.joining(" == "," { ", " } "));

        //String joinString= list.stream().collect(Collectors.joining(" == ","[  ","  ]"));

        System.out.println("Modified String : " + joinString);

        System.out.println("Original String :  "+list);

    }
}
