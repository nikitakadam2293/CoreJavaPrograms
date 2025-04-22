package ExceptionHandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsWhyWeUse {

    ThrowsWhyWeUse o = new ThrowsWhyWeUse();

    void test() throws ArithmeticException, NullPointerException
    {
        int c= 10/0;  //runtime
        System.out.println(c);

        /*File file = new File("demo.txt"); //

        FileInputStream stream = new FileInputStream(file);  //runtime*/


    }

    void test2()
    {
        try
        {
            int z = 11/0;
            o=null;
            o.test2();

        }
        catch (ArithmeticException | NullPointerException e)
        {
            System.out.println(e);
        }

    }
    public static void main(String[] args) {

       // o.test2();
    }

}
