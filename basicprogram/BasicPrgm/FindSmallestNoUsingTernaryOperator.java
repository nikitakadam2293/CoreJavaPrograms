package basicprogram.BasicPrgm;

import java.util.Scanner;

public class FindSmallestNoUsingTernaryOperator {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First No");
        int a = sobj.nextInt();

        System.out.println("Enter Second No");
        int b = sobj.nextInt();

        int small = a<b ? a:b;
        System.out.println("Smallest no is : " + small);
    }
}
