package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.List;


// 31) How do you get last element of an array?

public class GetLastEleFromArray {

    public static void main(String[] args) {

        List<String> s = Arrays.asList("apple","mango","banana","pineapple","grapes");

        System.out.println("Size : " + s.size());
        String lastEle = s.stream().skip(s.size()-1).findFirst().get();
        System.out.println("LAst Element of Array : " + lastEle);  // LAst Element of Array : grapes

    }
}
