package collectionframework.linkedlistprogram;

import java.util.LinkedList;
import java.util.ListIterator;

public class UsingListIterator {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("White");

        System.out.println("Using List Iterator : ");

        ListIterator<String> listIterator = list.listIterator();

        System.out.println("");
        System.out.println("Forword  Direction : ");

        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println();
        System.out.println(" Backword Direction : ");

        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());

          //   list.add("10");  CME exception

           // list.remove(1);  CME exception
        }

        System.out.println(list);
    }
}
