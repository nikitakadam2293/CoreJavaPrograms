package java8programming.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapMethod {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java","phyton","c","c++","php");

        Map<String , Integer> map = list.stream().collect(Collectors.toMap(l->l,len->len.length()));

        System.out.println("Length is : " + map);
    }
}
