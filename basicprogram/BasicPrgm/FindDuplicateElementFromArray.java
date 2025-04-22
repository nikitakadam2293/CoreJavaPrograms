package basicprogram.BasicPrgm;

import java.util.Scanner;

public class FindDuplicateElementFromArray {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int a= sobj.nextInt(); //4
        int arr[]= new int[a]   ;

        System.out.println("Enter Array Element : ");
        for(int i =0; i<arr.length ;i++)
        {
            arr[i] = sobj.nextInt();
        }
        for (int i =0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        //find dublicate


        boolean hasTrue = false;
        System.out.println("Dublicate Ele : ");
        for(int i=0; i< arr.length; i++)
        {
            int count =1;
            for (int j=i+1; j< arr.length; j++)
            {

                if(arr[i] == arr[j])
                {

                    System.out.println(arr[i]);
                    hasTrue =true;
                    break;
                   //  count++;   //count give problem

                  //  System.out.println("Dublicate Element is : "+ arr[i] + " count is : "+count);
                }




            }
        }
    }
}
