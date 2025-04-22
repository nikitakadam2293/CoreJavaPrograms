package collectionframework.vector;

import java.util.Vector;

public class VectorMethod {
    public static void main(String[] args) {

        Vector<String> v = new Vector<String>();

        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        System.out.println("Elements: " +v);

        String firstElement = v.firstElement();
        System.out.println("First Element : " + firstElement);   //A

        String lastElement = v.lastElement();
        System.out.println("Last Element : "+ lastElement);   //E

        String atSpecific = v.elementAt(3);
        System.out.println("Element at index : " + atSpecific); //D

        boolean checkElement = v.contains("F");
        System.out.println("Check F present or not : " +checkElement );  //false

        System.out.println("=======================");

        System.out.println("Get Element at specific index : " + v.get(3));  //D

        System.out.println("HashCode is : " + v.hashCode());  //90690786

        v.insertElementAt("0000", 5);
        System.out.println("Insert Element at specific index  :: " + v );

        Integer indexOf = v.indexOf(null);
        System.out.println("Index of null is : " + indexOf);  //-1

        System.out.println("=======================");

        System.out.println( " Copy vector into array");

        String arr[] = new String[6] ;
        v.copyInto(arr);

        for(String s : arr)
        {
            System.out.println(s);
        }

        System.out.println("Clone Method : ");
        Object o = v.clone();

        System.out.println("Clone is : " +o);  //Clone is : [A, B, C, D, E]


    }
}
