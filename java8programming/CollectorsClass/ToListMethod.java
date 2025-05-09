package java8programming.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListMethod {

    public static void main(String[] args) {
        List<String> l = Arrays.asList("java","phyton","c","c++","php","phyton");
         l.stream().collect(Collectors.toList()).stream().forEach(System.out::println);
        System.out.println("===============");

        l.stream().collect(Collectors.toSet()).stream().forEach(System.out::println);

    }
}
