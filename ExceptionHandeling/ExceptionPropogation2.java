package ExceptionHandeling;

public class ExceptionPropogation2 {
    public static void main(String[] args) {

        //Unchecked Exceptions propogation

        ExceptionPropogation2 obj = new ExceptionPropogation2();
        obj.p();

        System.out.println("Normal Flow");
    }

    void p()
    {
        try
        {
            n();
        }
        catch (Exception e)
        {
            System.out.println("Exception : " +e);
        }

    }

    void n()
    {
        m();
    }

    void m()
    {
       int a =10/0;


    }

}
//Exception : java.lang.ArithmeticException: / by zero
//Normal Flow