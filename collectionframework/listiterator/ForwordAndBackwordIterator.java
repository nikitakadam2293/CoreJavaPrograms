package collectionframework.listiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ForwordAndBackwordIterator {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Forword Direction : ");

        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

        System.out.println("Backword Direction : ");
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
}
