package collectionframework.comparableandcomparator;

import java.util.Arrays;

public class PrimitiveSorting {
    public static void main(String[] args) {

        int number[] = { 5, 3, 8, 2, 1 };

        System.out.println( "Original Array : " +Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("After Sorting : " + Arrays.toString(number));

        char c [] ={'a','i','e','u','o'};

        System.out.println("Original Array : " + Arrays.toString(c));

        Arrays.sort(c);

        System.out.println("Sorted Array : " + Arrays.toString(c));
    }
}
