package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.List;

public class FlatMap {

    public static void main(String[] args) {

        List<List<String>> flatmap = Arrays.asList(
                Arrays.asList("aa","bb"),
                Arrays.asList("cc","dd")
        );

        flatmap.stream().flatMap(List::stream).forEach(System.out::println);

    }
}





