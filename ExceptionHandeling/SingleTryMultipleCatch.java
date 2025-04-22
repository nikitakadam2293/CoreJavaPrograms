package ExceptionHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SingleTryMultipleCatch {

    void test()
    {
        System.out.println("Test method called");

    }

    public static void main(String[] args) {

        /*try
        {
            FileInputStream fis = new FileInputStream("");

        }
        catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }*/

        try {
            SingleTryMultipleCatch obj = new SingleTryMultipleCatch();    //null;
            obj.test();  // NPE

            int a = 100 / 10;  //AE

            int[] intArray = new int[5];

/*
            intArray[7] = 100;   //AIOE
            System.out.println(intArray[3]);
*/

            String str ="java";
            char cc = str.charAt(10);
            System.out.println(cc);

        }
        catch (ArithmeticException ee)
        {
            System.out.println("Got Arithmetic Exception" +  ee.getMessage());
        }
        catch (NullPointerException npe)
        {
            System.out.println("Got NullPointerException Exception" +  npe.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ee)
        {
            System.out.println("Got ArrayIndexOutOfBoundsException Exception  " +  ee.getMessage());

            throw new RuntimeException("Got Exception");

            //throw new RuntimeException();
        }
        catch (Exception exception)
        {
            System.out.println("Caught in generic catch block" );
        }

        int b= 100/10;
        System.out.println("value of b "+b);

    }
}
