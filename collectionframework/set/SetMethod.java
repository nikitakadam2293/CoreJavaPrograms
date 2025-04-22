package collectionframework.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        System.out.println("Size is  : " + set.size());

        set.add("orange");
        set.add("red");
        set.add("blue");
        set.add("yellow");
        set.add("green");

        System.out.println("Size is  : " + set.size());

        set.add("red");
        set.add("blue");

        System.out.println("Size is  : " + set.size());


        if (set.equals("black"))
        {
            System.out.println("black is not in set");
        }
        else
        {
            set.add("black");
            System.out.println("black added successfully ");
            System.out.println("Set is : " + set);  //Set is : [orange, red, green, blue, yellow, black]

        }

        Set<String > s2 = new LinkedHashSet<>();
        s2.add("white");
        s2.add("brown");
        s2.add("red");

        System.out.println();
        System.out.println("Add two set : ");  //[orange, red, green, blue, white, yellow, black, brown]


        set.addAll(s2);
        System.out.println(set);

        System.out.println("++++ ++++ ++++ ++++");

        System.out.println("remove ");
        set.remove("yellow");

        System.out.println("Afetr removing   " +set);

        System.out.println("Check element present or not  : ");

        System.out.println(set.contains("blue"));  //true

        set.add(null);

        System.out.println("Set After adding null" + set);  //Set After adding null[orange, red, null, green, blue, white, black, brown]

    }
}
