package collectionframework.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("List is : "+ list);

        ListIterator<String>  iterator =list.listIterator();

        boolean elementPresent = iterator.hasNext();
        System.out.println("Element is present ? " +elementPresent );

        int indexA = iterator.nextIndex();
        String elementA = iterator.next();
        System.out.println("indexA : "+indexA + "  ElementA : "+ elementA);

        int indexB = iterator.nextIndex();
        String elementB = iterator.next();
        System.out.println("indexB : "+indexB + "  ElementB : "+ elementB);

        int indexC = iterator.nextIndex();
        String elementC = iterator.next();
        System.out.println("indexC : "+indexC + "  ElementC : "+ elementC);

        boolean elePresent = iterator.hasNext();
        System.out.println("Element is present ? " +elePresent );

        /*String element = iterator.next();  //NoSuchElementException
        System.out.println(element);*/
    }
}
/*
List is : [A, B, C]
Element is present ? true
indexA : 0  ElementA : A
indexB : 1  ElementB : B
indexC : 2  ElementC : C
Element is present ? false
* */