package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 13) Find sum of all digits of a number in Java 8?

public class FindSumOfAllDigitInNo {

    public static void main(String[] args) {

        int no = 1234541;

        int sum = Stream.of(String.valueOf(no).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println("Total sum is : " + sum);

        System.out.println("+++++++++++++++++++++++++++++++++");

        int sum1 =0;
        while (no!=0)
        {
            int digit = no % 10;

             sum1 = sum1 + digit;

             no=no/10;

        }

        System.out.println("Sum using while loop : " + sum1);
    }
}
