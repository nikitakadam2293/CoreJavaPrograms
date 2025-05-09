package java8programming.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingMethod {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java","phyton","c","c++","php");

       Map<Character,List<String>> gr =   list.stream().collect(Collectors.groupingBy(l->l.charAt(0)));

        System.out.println("Gr : " + gr);  // Gr : {p=[phyton, php], c=[c, c++], j=[java]}

        System.out.println("Gr : " + gr.keySet());  // Gr : [p, c, j]

        System.out.println("Gr : " + gr.values());   //  Gr : [[phyton, php], [c, c++], [java]]



    }
}
