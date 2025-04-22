package collectionframework.enumeration;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Enumeration1 {
    public static void main(String[] args) {
        Vector v = new Vector();

        Enumeration e= v.elements();
        Iterator itr= v.iterator();
        ListIterator litr=v.listIterator();

        System.out.println("Enumeration : " +e.getClass().getName());
        System.out.println("Iterator : " +itr.getClass().getName());
        System.out.println("ListIterator : " + litr.getClass().getName());

     //   Iterator it = new Vector();
    }
}
/*
Enumeration : java.util.Vector$1
* vector$1 ➨ Inside vector, $ is the inner class name and 1 is the
* convention which is applicable for anonymous class
*

* Iterator : java.util.Vector$Itr
ListIterator : java.util.Vector$ListItr
* */