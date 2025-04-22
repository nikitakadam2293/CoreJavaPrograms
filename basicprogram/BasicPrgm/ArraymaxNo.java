package basicprogram.BasicPrgm;

import java.util.Scanner;

class Array1 {
    //int arr[] = {10, 21, 15, 31,65,2};

    void array() {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sobj.nextInt();  //8

        int arr[] = new int[size];

        System.out.println("enter no");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sobj.nextInt();
        }
        System.out.println("Display no");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println( "Max is: " +max);

        //for(int )


    }
}
    public class ArraymaxNo {
        public static void main(String[] args) {
            Array1 o = new Array1();
            o.array();
        }
    }
