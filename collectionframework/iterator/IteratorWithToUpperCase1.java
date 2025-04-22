package collectionframework.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// adding element in second arraylist from 1st arraylist
public class IteratorWithToUpperCase1 {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Red");
        coll.add("Pink");
        coll.add("Pitch");
        coll.add("BLUE");

        System.out.println("Before : " +coll);

        ArrayList<String> newArrayList = new ArrayList<>();
        Iterator<String> itr = coll.iterator();
        while(itr.hasNext())
        {
            String newElement  =  itr.next().toUpperCase();
            newArrayList.add(newElement);
        }
        coll.clear();
        coll.addAll(newArrayList);

        System.out.println("After : "+ coll);


    }

}
