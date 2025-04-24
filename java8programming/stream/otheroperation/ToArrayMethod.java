package java8programming.stream.otheroperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayMethod {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("mangooo");
        list.add("apple");
        list.add("banana");
        list.add("pineaple");
        list.add("grapes");

       Object arr[] =  list.stream().distinct().limit(4).toArray();

        System.out.println("Array is : " + Arrays.toString(arr));

    }
}
