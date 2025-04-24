package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.stream.IntStream;

// 20) Reverse an integer array

public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = new int[] {1,3,5,2,6,8,10,2,1,2};

        int reverseArray[] = IntStream.rangeClosed(1,arr.length).map(i-> arr[arr.length-i]).toArray();
        System.out.println(Arrays.toString(reverseArray));

    }
}
