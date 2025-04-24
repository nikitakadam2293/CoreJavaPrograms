package java8programming.stream.selectionoperation;

import java.util.ArrayList;
import java.util.List;

public class FilterMethod {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();

        str.add("one");
        str.add("apple");
        str.add("banana");
        str.add("pineapple");
        str.add("two");
        str.add("three");

        str.stream().filter(s->s.length()>3).forEach(System.out::println);


    }
}
