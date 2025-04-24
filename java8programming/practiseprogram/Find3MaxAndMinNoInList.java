package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find3MaxAndMinNoInList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,1,2,3,4,5,6,6,7,4,10,9,4);

        System.out.println("Minimum 3 No : ");
         list.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("Maximum  3 no : ");

        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

    }
}
