package java8programming.stream.selectionoperation;

import java.util.ArrayList;
import java.util.List;

public class SkipMethod {
    public static void main(String[] args) {

        List<String> s = new ArrayList<>();

        s.add("one");
        s.add("two");
        s.add("three");
        s.add("four");
        s.add("five");
        s.add("one");
        s.add("six");
        s.add("seven");

      //  s.stream().skip(3).forEach(System.out::println);

        s.stream().skip(4).forEach(ss-> System.out.println(ss));

    }
}
