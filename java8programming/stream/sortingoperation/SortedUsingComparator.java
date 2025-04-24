package java8programming.stream.sortingoperation;

import java.util.ArrayList;
import java.util.List;

public class SortedUsingComparator {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("pineapple");
        list.add("apple");
        list.add("mango");
        list.add("banana");
        list.add("dd");
        list.add("Zz");
        list.add("FFz");


        // //Sorting the names according to their length

        list.stream().sorted((String s1, String s2)->s1.length()-s2.length()).forEach(System.out::println);

        System.out.println("Sorted normal way");
        list.stream().sorted().forEach( System.out::println);

        System.out.println("Original list : " + list);


    }
}
