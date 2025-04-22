package collectionframework.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetMethod {
    public static void main(String[] args) {

        HashSet<String>  set = new HashSet<>();

        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Fourth");
        set.add("Fifth");

        set.add("First");
        set.add("Third");

        set.add(null);
        set.add(null); //

        System.out.println(set);

        System.out.println("====");

        ArrayList<String> al = new ArrayList<String>();
        al.add("Monday");
        al.add("Tuesday");
        al.add("Wednesday");
        al.add("Thursday");
        al.add("Friday");

        set.addAll(al);
        System.out.println("Set is : "+set);

        System.out.println(set.remove("Friday"));  //true

        System.out.println(set.removeAll(set));  // true

        System.out.println(set.size());  //0\

        System.out.println("Contain :  " + set.contains("Wednesday"));  //false
    }
}
