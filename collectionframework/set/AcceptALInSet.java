package collectionframework.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AcceptALInSet {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("List is : " + list);

        Set<Integer> set = new HashSet<>(list);

        System.out.println("Set is : " + set);
    }
}