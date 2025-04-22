package StringClass;

import java.util.Scanner;

public class Wordcount {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String");
        String s= sobj.nextLine();

        String format = "[,\\s \\ .]";

        String newString[]= s.split(format);

        for(String str: newString)
        {
            System.out.println(str);
        }

    }
}
