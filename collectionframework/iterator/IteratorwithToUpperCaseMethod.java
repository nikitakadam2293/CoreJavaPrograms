package collectionframework.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorwithToUpperCaseMethod {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Red");
        collection.add("Green");
        collection.add("Black");
        collection.add("White");
        collection.add("Pink");

        System.out.println("Before : " +collection);
        Iterator<String> itr = collection.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next().toUpperCase());
        }
        System.out.println("After Upper Case : " + collection);//Strings in Java are immutable.
        // This means that methods like toUpperCase() do not change the original string;
        // they return a new string with the changes.


    }
}
