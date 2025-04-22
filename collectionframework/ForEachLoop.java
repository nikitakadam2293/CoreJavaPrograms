package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ForEachLoop {
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
        list.add("Test");
       list.add("Test");  // if not add this line it give  //.IndexOutOfBoundsException



        //==================/////
        for(int i=0; i< list.size(); i++)
        {
            list.remove(i);  //remove(0)
            System.out.println("Print each element in LinkedList : " +list.get(i));  //get ("F")
        }




        for(int i=0; i<list.size(); i++)
        {

            System.out.println("Print each element in LinkedList : " + list.get(i));
        }

       /* // for each = fail fast iterator
        for(String s: list)
        {
            list.add("Test"); //we are modifying that collection during iteration it causes ConcurrentModificationException
          System.out.println("Print each element in linked list :::: " +s);
        }*/


        //Iterator => fail safe iterator
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext())
        {
          //  iterator.remove();  //IllegalStateException
            String element =iterator.next();
            iterator.remove();  //we are not modifing collection here
            System.out.println("Print each element using iterator ===="+element);
        }







        Integer[] arr= {90,80,90,70,70,70,70,70,null,null,null};
        System.out.println(arr);

        arr[3] = null; //element GC eligible

        Integer[] newArray= new Integer[10];

        newArray[0] =100;
        newArray[1] =200;
        newArray[5] =3000;

        System.out.println(newArray.length);

        for(Integer i: newArray)
        {
            System.out.println(i);
        }

    }
}
