package collectionframework.listiterator;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Orange");
        list.add("Blue");
        list.add("White");

        System.out.println("List is : " +list);

        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Forword direction : ");
        while (listIterator.hasNext())
        {
            int index1 = listIterator.nextIndex();
             String ele1=  listIterator.next();
            System.out.println("index is : " +index1 + "  ele1 : "+ ele1 );
        }

        System.out.println("Backword Direction : ");
        while (listIterator.hasPrevious())
        {
            int index2 = listIterator.previousIndex();
            String ele2 = listIterator.previous();
            System.out.println("index is : " +index2 + "  ele1 : "+ ele2 );

        }

    }
}
