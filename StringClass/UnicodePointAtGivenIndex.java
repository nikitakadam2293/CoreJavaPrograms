package StringClass;

import java.util.Scanner;

public class UnicodePointAtGivenIndex {
    public static void main(String[] args) {

        Scanner sobj=new Scanner(System.in);
        System.out.println("enter index");
        int i= sobj.nextInt();

        String str= "Hello World" ;
        System.out.println("Unicode point is : " + str.codePointAt(i));


        System.out.println(str.codePointCount(1,7));
        ///////////

        String str1= "Hello World" ;
        char arr[]=new char[] {'1','2','2','4'};
        String s= String.copyValueOf(arr, 0,3);
        System.out.println("==" + s);


    }
}
