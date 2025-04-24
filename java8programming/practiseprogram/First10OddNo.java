package java8programming.practiseprogram;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// 30) First 10 odd numbers

public class First10OddNo {
    public static void main(String[] args) {

        Stream.iterate(1,n->n+2).limit(10).forEach(System.out::println);

        System.out.println("============First 10 Odd No================");

        Stream.iterate(1,e->e+2).limit(10).forEach(e-> System.out.println(e));

        System.out.println("First 10 even no : ");

        Stream.iterate(0,x->x+2).limit(10).forEach(System.out::println);
    }
}
