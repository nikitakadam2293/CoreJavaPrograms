package java8programming.stream.otheroperation;

import java.util.Optional;
import java.util.stream.Stream;

public class ForEachMethd {

    public static void main(String[] args) {

         Stream.of("First", "Second", "Second", "Third", "Fourth").limit(3).distinct().forEach(System.out::println);
    }
}
