package basicprogram.BasicPrgm;

import java.util.Scanner;

public class Validate_Email {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Email Id " );
        String str = sobj.nextLine();

        String regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,18}$";

        if(str.matches(regex))
        {
            System.out.println("Valid Email Address");
        }
        else
        {
            System.out.println("Invalid Email Address");
        }

    }
}

/*
user123@gmail.com

test.email@yahoo.co.in

first_last-123@company-domain.org

abc.def@domain.co


 */
