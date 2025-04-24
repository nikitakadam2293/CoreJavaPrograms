package java8programming.stream.creationoperation;

import java.util.ArrayList;
import java.util.List;

/*
Creating streams from collections
From Java 8, every collection type will have a method called stream() which returns the
stream of respective collection type.
 * */
public class CreateStreamFromCollection {
    public static void main(String[] args) {

        List<String> str= new ArrayList<>();
        str.add("one");
        str.add("two");
        str.add("three");

        str.stream().forEach(s-> System.out.println(s));

        System.out.println("===================================");

        str.stream().forEach(System.out::println);
    }
}
