package java8programming.practiseprogram;

import java.util.stream.IntStream;


// 21) Print first 10 even numbers

public class First10EvenNo {

    public static void main(String[] args) {

        IntStream.rangeClosed(1,10).map(i->i*2).forEach(System.out::println);

    }
}
