package StringClass;

import java.util.Scanner;

public class ReverseWordInString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();

       String word[] =str.split("\\W+");

       for(int i = word.length -1; i>=0 ; i--)
       {
           System.out.print(word[i]);
           System.out.print(" ");
       }

    }
}
