package collectionframework.linkedlistprogram;

import java.util.LinkedList;

public class IterationLLUsingWhileLoop {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("White");

        System.out.println("Using While Loop : ");

        Integer i =0;

        while (i<list.size())
        {
            String s= list.get(i);
            System.out.println(s);
            i++;
        }

    }
}
