package collectionframework.vector;

import java.util.Vector;

public class VectorMethod3 {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        for(int i=0 ; i<=10 ; i++)
        {
            if(i% 2 ==0)
            {
               v.add(i);
                System.out.println(i);
            }
        }

        System.out.println("Size of Vector is == : "  + v.size());  //6

        System.out.println("Capacity of Vector is : "+ v.capacity());  //10

        v.ensureCapacity(25);

        System.out.println("Minimum Capacity is : " + v.capacity());   //25

        String s = v.toString();
        System.out.println("Using toStrimg : " + s);  //Using toStrimg : [0, 2, 4, 6, 8, 10]

        v.toArray();
        System.out.println(v);  //[0, 2, 4, 6, 8, 10]

    }
}

