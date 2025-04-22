package StringClass;

import java.util.Scanner;

public class CharacterAtSpecifiedIndex {
    public static void main(String[] args) {
        String str= new String("Hello world");

        Scanner sobj=new Scanner(System.in);
        System.out.println("enter index");
        int i= sobj.nextInt();

        System.out.println("character at specified index is : "+ str.charAt(i));
    }
}
