package collectionframework.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class DEnumeratinTestUsingGeneric {
    public static void main(String[] args) {

        Vector<Integer> v =new Vector<>();

        for(int i=0; i<=10; i++)
        {
            v.addElement(i);
        }
        System.out.println("first : " + v);

        Enumeration e = v.elements();

        while (e.hasMoreElements())
        {
            Integer i = (Integer) e.nextElement();
            System.out.println("Second : "+ i);
        }

        Enumeration en= v.elements();
        while (en.hasMoreElements())
        {
            Integer it= (Integer) en.nextElement();

            if(it % 2 ==0)
            {
                System.out.println("Even : "+ it);
            }
        }
    }

}
