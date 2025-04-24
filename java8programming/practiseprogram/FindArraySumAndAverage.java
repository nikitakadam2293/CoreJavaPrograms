package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.OptionalDouble;

// 16) Given an integer array, find sum and average of all elements?

public class FindArraySumAndAverage {
    public static void main(String[] args) {

        int arr[] = new int[]{1,23,1,20,5};

        int sum =Arrays.stream(arr).sum();
        System.out.println("Sum is : " + sum);

        OptionalDouble average = Arrays.stream(arr).average();
        System.out.println("Average is : " + average);

        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("avg : " + avg);
    }
}
