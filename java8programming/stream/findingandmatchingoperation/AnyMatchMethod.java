package java8programming.stream.findingandmatchingoperation;

import java.util.ArrayList;
import java.util.List;
//  anyMatch() : Any one element matches
public class AnyMatchMethod {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("mangooo");
        list.add("apple");
        list.add("banana");
        list.add("pineaple");
        list.add("grapes");

        boolean anyMatch = list.stream().anyMatch((s)->s.length()>=8);

        if(anyMatch)
        {
            System.out.println("element found : ");
            list.stream().filter((a)->a.length()>5).forEach(System.out::println);
        }






      /*  if(list.stream().anyMatch((s)->s.length()>7))
        {
            System.out.println("anyMatch element is present " );
        }*/
    }
}
