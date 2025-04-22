package collectionframework.linkedlistprogram;

import java.util.LinkedList;

public class LLPollAndPeek {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("INDIA");
        list.add("USA");
        list.add("JAPAN");
        list.add("UK");
        list.add("CANADA");

        System.out.println("Initial LinkedList order");
        System.out.println(list);

        System.out.println("Peek First Element : " + list.peekFirst());
        System.out.println("Peek Last Element : " + list.peekLast());

        System.out.println("Poll First Element : " + list.pollFirst());
        System.out.println("Poll Last Element : "+ list.pollLast());

        System.out.println("Original List" + list);

    }
}
