package ExceptionHandeling;

import java.io.IOException;

public class ExceptionPropogation3 {

    public static void main(String[] args) {

        ExceptionPropogation3 obj = new ExceptionPropogation3();

        obj.p();
    }

    void p()
    {
        try
        {
            n();
        }
        catch (Exception e)
        {
            System.out.println("Exception handel " +e);
        }

    }

    void n() throws IOException
    {
        m();
    }

    void m() throws IOException
    {
        throw new IOException ("device error");
    }
}
