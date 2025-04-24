package java8programming.stream.findingandmatchingoperation;

import java.util.ArrayList;
import java.util.List;

// allMatch() : All elements matches

public class AllMatchMethod {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("mangooo");
        list.add("apple");
        list.add("banana");
        list.add("pineaple");
        list.add("grapes");

        if(list.stream().allMatch((s)->s.length()>7))
        {
            System.out.println("All elemnt matches ");
        }
        else
        {
            System.out.println("No All element matches");
        }
    }
}
