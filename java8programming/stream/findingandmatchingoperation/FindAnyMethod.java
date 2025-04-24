package java8programming.stream.findingandmatchingoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyMethod {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("mangooo");
        list.add("apple");
        list.add("banana");
        list.add("pineaple");
        list.add("grapes");

        Optional<String> f = list.stream().findAny();
        System.out.println("Find Any : " + f);

        Optional<String> findAny = Stream.of("six","two","three").findAny();
        System.out.println("Find Any : " + findAny);  //Optional[six]





    }
}
