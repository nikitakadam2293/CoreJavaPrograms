package ExceptionHandeling;

import java.util.Scanner;

class AgeInvalid extends Exception
{
    AgeInvalid(String str)
    {
        super(str);
    }
}

public class CustomExceptionUsingThrow {

    public static void main(String[] args) {
        Scanner  sobj = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sobj.nextInt();

        try
        {
            if(age< 18)
            {
                throw new AgeInvalid("Age is below 18");
            }
        }
        catch (AgeInvalid a)
        {
            System.out.println("inside catch");
            System.out.println(a);
        }

    }

}
