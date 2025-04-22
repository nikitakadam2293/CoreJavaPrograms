package ExceptionHandeling;

import java.io.IOException;
import java.sql.SQLException;

public class MultipleCatchScenario {

    void multipleCatch()
    {
        try
        {
            int arr[]= new int[6];
            arr[3] = 20/0;
            System.out.println("Inside try");

        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Arithmetic exception");
        }
        catch(Exception e)
        {
            System.out.println("Exception occure"+ e.getMessage());
        }

    }

    public static void main(String[] args) {
        MultipleCatchScenario obj = new MultipleCatchScenario();
        obj.multipleCatch();

    }
}
