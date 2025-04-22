package collectionframework.linkedlistprogram;

import java.util.LinkedList;

public class LLMethod1 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        int size = list.size();
        System.out.println("Size of Linkedlist: " +size);


        list.add("Zero");
        list.add("First");
        list.add("Second");
        list.add(null); // null elements are allowed in the linked list.
        list.add("Fourth");
        list.add("25");
        System.out.println("Initial LinkedList order: " +list);

        list.removeFirst();
        System.out.println("Remove First Element : " + list);

        list.removeLast();
        System.out.println("Remove Last Element : " +list);

        list.remove(1);
        System.out.println("Remove  Element at specific index : " +list);

    }
}
