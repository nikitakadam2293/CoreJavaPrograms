package collectionframework.linkedlistprogram;

import java.util.LinkedList;

public class IterateLinkedListUsingForLoop {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("White");

        System.out.println("Using For Loop");
        for(int i=0; i<list.size(); i++)
        {
            String str= list.get(i);
            System.out.println(str);
        }
    }
}
