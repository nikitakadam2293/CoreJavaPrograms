package basicprogram.BasicPrgm;

import java.util.Scanner;

public class India_Mobile_No_Validation {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Mobile No : ");
        String mobile = sobj.next();

        String regex = "^(\\+91|91)?[6-9][0-9]{9}$";

        if(mobile.matches(regex))
        {
            System.out.println("Mobile Number is Valid");
        }
        else
        {
            System.out.println("Mobile Number is not valid ");
        }

    }
}
