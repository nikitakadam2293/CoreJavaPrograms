package StringClass;

import java.util.Scanner;

public class ReverseStringToCharArray {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("String is : ");
        String s= sobj.nextLine();

        //First way
        /*char a[]=s.toCharArray();

        for (int i=a.length-1;i>=0; i--)
        {
            System.out.println(a[i]);
        }*/

        //Second Way
        /*for (int i=s.length()-1;i>=0; i--)
        {
            System.out.println(s.charAt(i));
        }
*/

        //////////////charAt()
        /*int len= s.length();
        String rev="";

        int i=len-1;
        while (i>=0)
        {
           rev +=  s.charAt(i);
           i--;
        }

        System.out.println("Reverse String "+rev);*/

        /*//////////////////toCharArray
        char arr[]= s.toCharArray();
        String rev="";

        int len=arr.length;
        int i=len-1;

        while (i>=0)
        {
            rev=rev+ arr[i];
            i--;
        }
        System.out.println("Reverse "+rev);*/



        ///////charAt()
        String rev1="";
        int j=s.length()-1;
        while (j>=0)
        {
            rev1 = rev1 +  s.charAt(j);
          j--;
        }
        System.out.println("reverse : " + rev1);
    }
}
