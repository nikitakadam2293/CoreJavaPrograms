package java8programming.practiseprogram;

import java.util.*;
import java.util.stream.Collectors;

// 25) How do you extract duplicate elements from an array?

public class FindDublicateElementFromArray {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,1,44,1,44,7,88,44,1,2);

        Set<Integer> uniqueElement = new TreeSet<>();

        Set<Integer> dublicate = list.stream().filter(i->  uniqueElement.add(i)).collect(Collectors.toSet()) ;

        System.out.println("If not use  !  before  uniqueElement ( Remove Dublicate  )  : " + dublicate);  //  : [1, 2, 7, 88, 44]

        System.out.println("============================");


        Set<Integer>  unique = new HashSet<>();
        Set<Integer> d = list.stream().filter(e-> ! unique.add(e)).collect(Collectors.toSet());
        System.out.println("Dublicate : " +d);   // Dublicate : [1, 2, 44]


    }
}

