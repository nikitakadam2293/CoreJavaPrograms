package collectionframework;

import java.util.ArrayList;

public class ConvertingAlToArray {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("John");
        list.add("Bob");
        list.add("Mark");
        list.add("Deep");

        String [] array1 = list.toArray(new String[list.size()]);

        for(int i=0; i<array1.length; i++)
        {
            System.out.println(array1[i]);
        }
    }

}
