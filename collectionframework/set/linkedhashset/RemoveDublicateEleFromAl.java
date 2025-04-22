package collectionframework.set.linkedhashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDublicateEleFromAl {
    public static void main(String[] args) {


        //  this logic also work
         //ArrayList<Integer> al = new ArrayList<>();

        int arr[] = {10,1000,20,30,10,40,60,20,20};
/*
        for (int i =0; i<arr.length; i++)
        {
            al.add(arr[i]);
        }*/

    /*    System.out.println("Array List is : " + al);

        System.out.println("Remove Dublicate Element from array using LinkedHashSet: ");

        LinkedHashSet<Integer> ll = new LinkedHashSet<>(al);

        System.out.println("After Removing Element From Array is : " + ll);

*/


        LinkedHashSet<Integer> ll = new LinkedHashSet<>();

        for(int i=0; i<arr.length; i++)
        {
            ll.add(arr[i]);
        }
        System.out.println(ll);  //[10, 1000, 20, 30, 40, 60]

    }
}
