package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountInArrayOrList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("one","three","seven","eight","two","three","two");

        Map<String,Long> l = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("count is : " + l);
    }
}
