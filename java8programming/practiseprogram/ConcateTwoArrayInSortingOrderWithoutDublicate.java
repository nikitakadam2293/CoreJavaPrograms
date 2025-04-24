package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ConcateTwoArrayInSortingOrderWithoutDublicate {

    public static void main(String[] args) {

        int a[] ={4,22, 2, 3, 7, 1, 3, 0};
        int b[] ={5, 2, 1, 44,44,44,44,0, 7, 4,100};

        int c[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
        System.out.println("Concate Two array without Dublicate : " + Arrays.toString(c));
    }
}
