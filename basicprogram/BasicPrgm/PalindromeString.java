package basicprogram.BasicPrgm;

import java.util.Scanner;

public class PalindromeString {

    Scanner sobj = new Scanner(System.in);


    void palindromeString()
    {
        System.out.println("Enter String : ");
        String s = sobj.nextLine();  //java

        char arr[] = s.toCharArray();
        String str="";

        int i=0;
        int j=0;

        for(i=0,j=arr.length-1; i<=j ; i++, j--)
        {
            str = str+ arr[i];
        }
        if(s.equals(str))
        {
            System.out.println("String is palindrom");
        }
        else {
            System.out.println("String is Not  palindrom");

        }

        System.out.println(str);



      //  for( i =0, j=s.length()-1; i>j ; i++,j-- )



       /* for(int i=s.length()-1; i>=0;i--)
        {
            str = str + s.charAt(i);
        }
        System.out.println(str);

        if(s.equals(str))
        {
            System.out.println("String is Palindrome ");
        }
        else {
            System.out.println("String is not palindrome");
        }*/
    }

    public static void main(String[] args) {

        PalindromeString obj = new PalindromeString();
        obj.palindromeString();
    }
}
