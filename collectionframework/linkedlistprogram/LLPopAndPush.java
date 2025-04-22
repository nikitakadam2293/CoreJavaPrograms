package collectionframework.linkedlistprogram;

import java.util.LinkedList;

public class LLPopAndPush {
    public static void main(String[] args) {

        LinkedList<Character> list = new LinkedList<Character>();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        System.out.println(" LinkedList is :");
        System.out.println(list);

        System.out.println("Pop element : " + list.pop());

        System.out.println("After Pop : "+list);

        System.out.println("Push element : ");
        list.push('Z');

        System.out.println("Final List : "+list);
    }
}

