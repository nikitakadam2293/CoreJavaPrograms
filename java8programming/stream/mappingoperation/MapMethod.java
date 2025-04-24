package java8programming.stream.mappingoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hello","World","java");

        List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("UpperCase : " + upperCase);

        List<String> lowerCase = list.stream().map(String:: toLowerCase).collect(Collectors.toList());

        System.out.println("LowerCase : " + lowerCase);

        List<Integer> length = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Length of each word : " + length);

        List<Integer> l = list.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println("Length is :::::::" + l);
    }
}
