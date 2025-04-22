package collectionframework.linkedlistprogram;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class LLMethod {
    public static void main(String[] args) {

        LinkedList list = new LinkedList(); // empty linked list.

        list.add("One");
        list.add(2);
        list.add(null); // null elements are allowed in the linked list.
        list.add("Four");

        System.out.println("Initial LinkedList order: " +list);

        list.add(3,"Three");

        list.addFirst("Zero");

        list.addLast("Last");

        System.out.println(list);

        // Adding all elements from existing ArrayList collection to the end of the
        // LinkedList.

        ArrayList al = new ArrayList<>();
        al.add("Six");
        al.add(7);
        al.add("Eight");

        System.out.println("Add AL to LL");

        list.addAll(al);

        System.out.println(list);

        System.out.println();


        // Adding all elements from an existing Vector collection at the specified
        // position of LinkedList.

        System.out.println("Adding Vector to LL");

        Vector v = new Vector();

        v.add(7.5);
        v.add(7.8);

        list.addAll(8,v);

        System.out.println(list);

    }

}
