package java8programming.practiseprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 24) Given a list of strings, find out those strings which start with a number?

public class FindStringStartWithInteger {

    public static void main(String[] args) {

        List<String>  list = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six","0");

        list.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);

        System.out.println("--------------------------------------------");


        List<String> l = new ArrayList<>();

        for(String s : list)
        {
            if(!s.isEmpty() && Character.isDigit(s.charAt(0)))
            {
                l.add(s);
            }
        }

        System.out.println("Using collection : " + l);
        System.out.println("--------------------------------------------");

        list.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }
}
