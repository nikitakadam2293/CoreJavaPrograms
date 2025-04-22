package collectionframework.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ThreeSetMethod {
    public static void main(String[] args) {

        Set<String> s = new TreeSet<>();

        System.out.println("Size : " + s.size());  //0
        System.out.println("isEmpty : " + s.isEmpty());  //true

        s.add("India");
        s.add("USA");
        s.add("Australia");
        s.add("New zealand");
        s.add("Switzerland");
        s.add("Switzerland");
        s.add("Switzerland");

        System.out.println("TreeSet is : " + s);  //TreeSet is : [Australia, India, New zealand, Switzerland, USA]

        System.out.println("Size is : " + s.size());

        System.out.println();
        System.out.println("Check India present : " + s.contains("India"));  // true

        System.out.println(s.remove("India"));  //true
        s.clear();
        System.out.println(s);  // []
    }
}
