package java8programming.practiseprogram;

// 19) How do you find sum of first 10 natural numbers?

import java.util.stream.IntStream;

public class SumOfFirst10NaturalNo {

    public static void main(String[] args) {

        int sum = IntStream.range(1,11).sum();
        System.out.println("First 10 Natural No Sum : " + sum);  // First 10 Natural No Sum : 55

    }
}
