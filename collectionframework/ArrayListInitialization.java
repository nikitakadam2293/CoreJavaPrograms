package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInitialization {
    public static void main(String[] args) {

        // Arrays.asList:

        ArrayList<String> ar=new ArrayList<String>(Arrays.asList("A","B","C"));

        System.out.println(ar);  //[A, B, C]


        //normal way

        ArrayList<String> ar1=new ArrayList<String>();
        ar1.add("D");
        ar1.add("E");
        ar1.add("F");
        System.out.println(ar1); //[D, E, F]

        //Anonymous inner class

        ArrayList<String> ar2=new ArrayList<String>(){

            {
                add("a");
                add("b");

            }  };
        System.out.println(ar2);  //[a, b]





    }
}
