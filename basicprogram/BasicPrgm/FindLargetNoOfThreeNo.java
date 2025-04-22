package basicprogram.BasicPrgm;

import java.util.Scanner;

public class FindLargetNoOfThreeNo
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First No");
        int a = sobj.nextInt();

        System.out.println("Enter Second No");
        int b = sobj.nextInt();

        System.out.println("Enter Three No");
        int c = sobj.nextInt();

        if(a>b && a>c)
        {
            System.out.println("Larget No is " +a);
        }
        else if (b>a && b>c) {
            System.out.println("Largest No is "+ b);
        }
        else
        {
            System.out.println("Larget is "+ c);
        }

    }
}
