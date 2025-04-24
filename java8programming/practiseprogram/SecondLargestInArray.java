package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestInArray {
    public static void main(String[] args) {

        List<Integer> i = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int secondLarge =i.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Largest no is : " + secondLarge);  // Second Largest no is : 75

        int secondSmallest = i.stream().sorted().skip(1).findFirst().get();
        System.out.println("Second Smallest no is : " + secondSmallest); // Second Smallest no is : 15

    }
}
