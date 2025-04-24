package java8programming.practiseprogram;


// 9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcateTwoUnsortedArrayInSingleSortedArray {
    public static void main(String[] args) {

        int a[] = new int[]{4,22, 2, 3, 7, 1, 3, 0};
        int b[] = new int[]{5, 2, 1, 44,44,44,44,0, 7, 4,100};

        int c[] = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();

        System.out.println(Arrays.toString(c));

    }
}
