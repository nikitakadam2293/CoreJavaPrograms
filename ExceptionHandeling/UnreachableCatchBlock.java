package ExceptionHandeling;

import java.sql.SQLException;
import java.util.Scanner;

public class UnreachableCatchBlock {

    public static void main(String[] args) {
        int x,y;
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter first no");
            //x=sobj.nextInt();
            x= Integer.parseInt(sobj.nextLine());

            System.out.println("Enter Second no");
            // y=sobj.nextInt();

            y= Integer.parseInt(sobj.nextLine());

            int z= x/y;
            System.out.println("z : " + z);
        }
       /* catch (RuntimeException e)
        {
            System.out.println("Runtime Exception");
        }*/
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException occure");
            //e.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occure");
        }

    }

}
