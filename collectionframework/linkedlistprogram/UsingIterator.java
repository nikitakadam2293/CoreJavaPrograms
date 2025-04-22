package collectionframework.linkedlistprogram;

import java.util.Iterator;
import java.util.LinkedList;

public class UsingIterator {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("White");

        System.out.println("Using Iterator Loop : ");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(list);
    }
}
/*

 Using Iterator Loop :
Red
Yellow
Green
White
[]
*
*/