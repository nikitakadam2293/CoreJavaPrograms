package StringClass;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String");
        String s= sobj.nextLine();

        System.out.println("Enter character");
        char a=sobj.next().charAt(0);

       /*
       //charAt()

       int count=0;

        for(int i=0; i<s.length();i++)

        {
            if(s.charAt(i)== a)
            {
                count++;
            }
        }
        System.out.println("total character count  : " + count );*/


      /*  char a[] = s.toCharArray();
        System.out.println("Enter character");
        char b=sobj.next().charAt(0);

        int count=0;

        for(int i=0; i< a.length;i++)
        {
            if(a[i]==b)   //  if(a[i] == b)
            {
                count++;
            }
        }
        System.out.println("total character count  : " + count );
        */


        /*int c = 0;
        char aa[]=s.toCharArray();
        int i=0;
        while (i<aa.length-1)
        {
            if(aa[i]== a)
            {
               c++;

            }
            i++;
        }
        System.out.println(" count of char is :"+ c);*/


        int count=0;
        int i=0;
        while (i<s.length())
        {
            if(s.charAt(i) == a)
            {
                count++;
            }
            i++;
        }
        System.out.println("count : " + count);
 }
}
