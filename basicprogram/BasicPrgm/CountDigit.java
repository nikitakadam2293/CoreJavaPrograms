package basicprogram.BasicPrgm;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {

        Scanner sobj=new Scanner(System.in);
        System.out.println(" Enter No");
        int no=sobj.nextInt();
        int count =0;
        int temp = no;
        while (temp!=0)
        {
            temp=temp/10;   // / remove last digit
           // System.out.println(temp);

            count++;

        }
        System.out.println("Total Digit Count :"+count);
    }
}
