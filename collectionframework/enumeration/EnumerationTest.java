package collectionframework.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String[] args) {

        //// Create object of vector class without using generic.
        Vector v = new Vector<>();

        for (int i=0; i<=10; i++)
        {
            v.addElement(i);
        }
        System.out.println ("first "+v);  // It will print all elements at a time like this  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10]

        Enumeration e=v.elements();
        while (e.hasMoreElements())
        {
            Object o = e.nextElement();
            Integer i= (Integer) o;

            System.out.println("Second : "+ i);

/*
Second : 0
Second : 1
Second : 2
Second : 3
Second : 4
Second : 5
Second : 6
Second : 7
Second : 8
Second : 9
Second : 10
*/
        }

        Enumeration en = v.elements();
        while (en.hasMoreElements())
        {
          /*  Object o= en.nextElement();
            Integer it= (Integer) o;*/ // it will also work properly

            Integer it =(Integer)  en.nextElement();

            if(it % 2== 0)
            {
                System.out.println( "Even :" +it);
            }
            else
            {
                System.out.println("odd : " +it);
            }
        }


    }
}
