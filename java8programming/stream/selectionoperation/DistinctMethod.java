package java8programming.stream.selectionoperation;

// distinct() : Selects only unique elements

import java.util.ArrayList;
import java.util.List;

public class DistinctMethod {
    public static void main(String[] args) {

        List<String>  names = new ArrayList<>();

        names.add("seven");
        names.add("one");
        names.add("two");
        names.add("one");
        names.add("three");
        names.add("four");
        names.add("one");
        names.add("five");
        names.add("one");
        names.add("five");

        names.stream().distinct().forEach(System.out::println);

    }
}
