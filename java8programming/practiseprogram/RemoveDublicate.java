package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicate {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("one","two","one","three","four","seven","four");

        List<String> l =  list.stream().distinct().collect(Collectors.toList());

        System.out.println("Unique element from list : " + l); // Unique element from list : [one, two, three, four, seven]

    }
}
