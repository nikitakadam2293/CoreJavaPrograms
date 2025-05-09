package java8programming.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","phyton","c","c++","php");

        String  rse = list.stream().collect(Collectors.joining("++"));
        System.out.println("Result : " + rse);
    }
}
