package collectionframework.set.treeset;

import java.util.TreeSet;

public class NavigableSetinterfacemethods {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(25);
        ts.add(80);
        ts.add(05);
        ts.add(100);
        ts.add(90);
        ts.add(200);
        ts.add(300);
        System.out.println("Sorted TreeSet: " +ts);

        System.out.println("Lower : " + ts.lower(100)); // Lower : 90

        System.out.println("Higher : " + ts.higher(100)); //Higher : 200
        System.out.println("Floor : " + ts.floor(84));  //Floor : 80
        System.out.println("Ceiling : "+ ts.ceiling(26)); //Ceiling : 80

        System.out.println("Poll First : " + ts.pollFirst());
        System.out.println(ts);  // [25, 80, 90, 100, 200, 300]

        System.out.println("Poll Last : " +  ts.pollLast()); // Poll Last : 300
        System.out.println(ts);  // [25, 80, 90, 100, 200]

        System.out.println(ts.headSet(90,true));  //[25, 80, 90]  // true indicate include 90 if
        // not use true it not include  90

        System.out.println("Subset : " + ts.subSet(90,true,200, true));
//Subset : [90, 100, 200]
    }
}
