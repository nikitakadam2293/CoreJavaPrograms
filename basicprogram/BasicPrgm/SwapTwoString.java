package basicprogram.BasicPrgm;

import java.util.Scanner;

public class SwapTwoString {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter Second String : ");
        String str2 = sobj.nextLine();

        str1 = str1+str2; //javaguides;

        str2= str1.substring(0,str1.length()-str2.length());  //java

        str1= str1.substring(str2.length());  //guides

        System.out.println("str1 : " +str1);

        System.out.println("str2 : " +str2);



    }
}
