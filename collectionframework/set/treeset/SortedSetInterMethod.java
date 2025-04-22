package collectionframework.set.treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetInterMethod {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        s.add("Delhi");
        s.add("New York");
        s.add("Paris");
        s.add("London");
        s.add("Delhi");

        System.out.println("HashSet is +========  "+ s);
        TreeSet<String>  t = new TreeSet<>(s);

        System.out.println("TreeSet : " +t);
        System.out.println("first : " + t.first());  // first : Delhi

        System.out.println("last : " + t.last());  // last : Paris


        System.out.println("HeadSet Element :  " + t.headSet("Paris")); // HeadSet Element  [Delhi]

        System.out.println("TailSet Element : " + t.tailSet("Paris"));

        System.out.println("SubSet : " + t.subSet("Paris","Paris"));  //SubSet : [Delhi, London, New York]



    }
}
