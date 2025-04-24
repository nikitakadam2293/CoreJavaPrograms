package java8programming.stream.selectionoperation;

import java.util.ArrayList;
import java.util.List;

//  limit() : Selects first n elements

public class LimitMethod {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

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

        names.stream().limit(6).forEach(System.out::println);

    }
}
