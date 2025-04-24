package java8programming.practiseprogram;

// 7) From the given list of integers, print the numbers which are multiples of 5?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNoMultiplesOf5 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,100,24,25,40,50,6,76,0,44,45);

        System.out.println("Using forEach : ");
        list.stream().filter(n->n%5 == 0).forEach(System.out::println);

        List<Integer> i = list.stream().filter(e->e%5 == 0).collect(Collectors.toList());
        System.out.println("Using Collector : " + i);



    }
}

