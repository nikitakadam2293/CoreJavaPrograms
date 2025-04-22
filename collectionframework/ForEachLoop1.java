package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ForEachLoop1 {
    public static void main(String[] args) {

        List<String> list= new LinkedList<>();

        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("C");
        list.add("D");

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext())
        {
            String element =iterator.next();
            iterator.remove();  //we are not modifing collection here
            System.out.println("Print each element using iterator ="+element);
        }


        for(int i=0; i<list.size(); i++)
        {
            // System.out.println("Print each element in LinkedList : " + list.get(i));
        }

    }
}
