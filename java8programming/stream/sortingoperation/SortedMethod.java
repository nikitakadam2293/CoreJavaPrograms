package java8programming.stream.sortingoperation;

import java.util.ArrayList;
import java.util.List;

public class SortedMethod {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("pineapple");
        list.add("apple");
        list.add("mango");
        list.add("banana");
        list.add("dd");
        list.add("Zz");

        list.stream().sorted().forEach(System.out::println);
    }
}
