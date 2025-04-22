package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class ALMethod {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Science");
        al.add("Maths");
        al.add("Hindi");
        al.add("English");
        al.add("Social Science");
        System.out.println("Original ArrayList insertion order: " +al);

        boolean b= al.contains("English");
        System.out.println(b);


        boolean bo= al.containsAll(al);
        System.out.println(bo);

        // iterating AL using enumeration

        Enumeration<String> enumeration = Collections.enumeration(al);

        while (enumeration.hasMoreElements())
        {
            System.out.println( "Iterating Array List using Enumeration : "+ enumeration.nextElement());
        }

    }
}
