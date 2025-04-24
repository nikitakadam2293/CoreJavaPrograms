package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinInGivenList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,11,3,1,5,0,44,77,99,4,6,7,0);

       int min = list.stream().min(Comparator.naturalOrder()).get();

        System.out.println("Minimum No : " + min); // 0

        int max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum No : " + max);   //99
    }
}
