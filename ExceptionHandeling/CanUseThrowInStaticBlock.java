package ExceptionHandeling;

public class CanUseThrowInStaticBlock {
    static int j;
    static {
        try
        {
            j= 10/0;

        }
        catch (Exception e)
        {
            System.out.println("Catch block");
            throw new RuntimeException(e.getMessage());

            //throw new ArithmeticException(e.getMessage()); if use this line then in console
            // ArithmeticException message show

        }
        finally {
            System.out.println("finaly");
        }
    }

    public static void main(String[] args) {

    }
}
/*
Catch block
Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.RuntimeException: / by zero
	at ExceptionHandeling.CanUseThrowInStaticBlock.<clinit>(CanUseThrowInStaticBlock.java:14)
* */