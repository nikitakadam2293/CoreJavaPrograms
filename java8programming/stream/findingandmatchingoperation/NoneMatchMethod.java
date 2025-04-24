package java8programming.stream.findingandmatchingoperation;

import java.util.ArrayList;
import java.util.List;

public class NoneMatchMethod {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("mangooo");
        list.add("apple");
        list.add("banana");
        list.add("pineaple");
        list.add("grapes");

        if(list.stream().noneMatch((s)->s.length()==2))
        {
            System.out.println("none match");
        }
        else
        {
            System.out.println("no none match");
        }

    }
}
