package basicprogram.BasicPrgm;

import java.util.Scanner;

public class USA_Mobile_No_Validation {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Mobile Number");
        String mobile = sobj.nextLine();


        String regex = "^(\\+1[\\s.-]?)?(\\(?[2-9][0-9]{2}\\)?)[\\s.-]?[2-9][0-9]{2}[\\s.-]?[0-9]{4}$";

        if(mobile.matches(regex))
        {
            System.out.println("Given Mobile Number is valid");
        }
        else
        {
            System.out.println("Given Mobile Number is not  valid");

        }
    }
}
