package basicprogram.BasicPrgm;

import java.util.Scanner;
public class ArmstrongNumber {

    void fun()
        {
            Scanner sobj=new Scanner(System.in);
            System.out.println(" Enter No");
            int no=sobj.nextInt(); //88

            int no2 = no;
            double sum =0;
            int length = String.valueOf(no).length();
            while (no>0)
            {
                int digit = no%10;
                sum= sum+Math.pow(digit,length);
                no=no/10;
            }

            if(sum==no2)
            {
                System.out.println("No is Arm ");
            }
            else
            {
                System.out.println("No is no Arm");
            }
        }

        public static void main(String[] args) {
            ArmstrongNumber o=new ArmstrongNumber();
            o.fun();
        }
    }

/*  int length= String.valueOf(no).length();

            while (no>0)
            {
                int x;
                int digit= no% 10;
                // sum = sum+ digit*digit*digit;
                sum= sum+Math.pow( digit, length);

                no=no/10;

            }
            if(no2==sum)
            {
                System.out.println("No is armstrong");
            }
            else
            {
                System.out.println("No is no arg");
            }*/

