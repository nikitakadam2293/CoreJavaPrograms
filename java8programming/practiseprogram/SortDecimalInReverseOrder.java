package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 5) How do you sort the given list of decimals/ integer  in reverse order?

public class SortDecimalInReverseOrder {
    public static void main(String[] args) {

        List<Double> list = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        System.out.println("Sorted Double Decreasing Order : ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        List<Integer> i = Arrays.asList(4,2,1,6,8,1,10,2,5,2);

        System.out.println("Sorted Integer Decreasing Order : ");
        i.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}

