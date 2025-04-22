package collectionframework.vector;

import java.util.Vector;

public class VectorMethod2 {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<>();

        System.out.println("Vector is empty? : " + vec.isEmpty());
        vec.add("Hydrogen");
        vec.add("Oxygen");

        vec.add("Boron");
        vec.add("Beryllium");
        vec.add("Boron");
        System.out.println("Elements: " +vec);
        System.out.println("Vector is empty? : " + vec.isEmpty());

        vec.setElementAt("HHHH" ,1);
        vec.setElementAt("ZZZZ" ,4);
        System.out.println("Vector is : " + vec);

        System.out.println("Size of Vector is : " + vec.size());  //5

        vec.setSize(14);
        System.out.println("Size of Vector is : " + vec.size());    //14

        System.out.println("Capacity of Vector is : " + vec.capacity());   //20

        System.out.println("Check Element Present or not : " + vec.equals("Beryllium"));

        boolean equality = vec.equals("Hydrogen");
        System.out.println("Is Carbon present: " +equality);
    }
}
