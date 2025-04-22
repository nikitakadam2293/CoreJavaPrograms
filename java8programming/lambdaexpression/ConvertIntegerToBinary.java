package java8programming.lambdaexpression;

/*
Write a Java program to implement a lambda expression to convert an integer
 to their corresponding binary representation.
 */

import java.util.Scanner;

interface IntegerToBinary
{
    String conver(int n);
}
public class ConvertIntegerToBinary {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter No : ");
        int no = sobj.nextInt();

        IntegerToBinary integerToBinary =(n)->{

            if(n==0)
            {
                return "0" ;
            }

            int value = n;
            StringBuffer sb = new StringBuffer();

            while (value>0)
            {
                sb.append(value%2);
                value = value / 2;

            }

            return sb.reverse().toString();
        };

       String binary =  integerToBinary.conver(no);

        System.out.println("Binary is : " +binary );
    }
}
