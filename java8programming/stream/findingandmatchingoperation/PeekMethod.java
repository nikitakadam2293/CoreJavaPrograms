package java8programming.stream.findingandmatchingoperation;

import java.util.ArrayList;
import java.util.List;

public class PeekMethod {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("mangooo");
        list.add("apple");
        list.add("banana");
        list.add("pineaple");
        list.add("grapes");


        list.stream()
                .filter(e-> e.length()>6)
                .peek(e-> System.out.println("Filter/ peek element : " + e ))
                .map(String::toUpperCase)
                .peek(e-> System.out.println("Map Element : " + e))
                .toArray();
    }
}
