package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ALMethod1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        boolean b = list.isEmpty();

        System.out.println("Before isEmpty : " + b);
        System.out.println( "list : " + list);

        list.add("INDIA");
        list.add("USA");
        list.add("SHRILANKA");
        list.add("JAPAN");
        list.add("FRANCE");

        System.out.println("Original Al : " + list);

        Integer size1 = list.size();
        System.out.println("Size is " + size1);

        boolean b1 = list.isEmpty();
        System.out.println("Check isEmpty After : "+ b1);

        System.out.println("Size of list : " +list.size());
    }
}
