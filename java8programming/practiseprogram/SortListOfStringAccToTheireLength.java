package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 15) Given a list of strings, sort them according to increasing order of their length?

public class SortListOfStringAccToTheireLength {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java","C#","c++","python","golang","java");

        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        /*
        C#
        c++
        Java
        java
        python
        golang
        */
        System.out.println("========================");
        list.stream().sorted(Comparator.comparing(String::length)).map(String::toUpperCase).forEach(System.out::println);

        /*C#
        C++
        JAVA
        JAVA
        PYTHON
        GOLANG
*/
    }
}
