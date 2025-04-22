package collectionframework.vector;

import java.util.ArrayList;
import java.util.Vector;

public class Vector1 {

    public static void main(String[] args) {

        Vector v = new Vector();

        System.out.println("Size of Vector is : " + v.size());  //0
        System.out.println("Capacity of Vector is : " +v.capacity());   //10

        v.add("Red");
        v.add("Green");
        v.add("Yellow");
        v.add("Pink");
        v.add("White");
        System.out.println("Vector is : " +v);

        System.out.println("After Adding element in vector : " );

        System.out.println("Size of Vector is : " + v.size());  //5
        System.out.println("Capacity of Vector is : " +v.capacity());   //10

        v.addElement(null);
        v.addElement(1111);

        System.out.println("Vector is : " +v);  //Vector is : [Red, Green, Yellow, Pink, White, null, 1111]

        // Adding Array List in vector

        ArrayList al = new ArrayList();
        al.add("array1");
        al.add("array2");

        v.addAll(al);

        System.out.println("Vector with AL is : " +v);  //Vector with AL is : [Red, Green, Yellow, Pink, White, null, 1111, array1, array2]

        v.add("Last");
        v.add("Last");

        System.out.println("Size of Vector is : " + v.size());  //11
        System.out.println("Capacity of vector is : "+v.capacity());  //20

        v.clear();
        System.out.println(v);   // []
    }
}
