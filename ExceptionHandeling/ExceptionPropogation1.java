package ExceptionHandeling;

public class ExceptionPropogation1 {

    public static void main(String[] args){

        ExceptionPropogation1 obj = new ExceptionPropogation1();

      obj.m1();
      /*  try
        {
            obj.m1();

        }
        catch (ArithmeticException arithmeticException)
        {
            System.out.println("Got an Exception "+  arithmeticException.getMessage());
        }*/

        System.out.println("????");
    }
    void m1()throws ArithmeticException
    {

       /* try
        {*/
            m2();

       /* }
        catch (ArithmeticException  arithmeticException )
        {
            System.out.println("Caught Exception : " + arithmeticException.getMessage());
        }*/
    }
    void m2()throws ArithmeticException
    {
        m3() ;
    }
    void m3()throws ArithmeticException
    {
        int b= 10;
        int c=0;

        if (c==0)
        {
            throw new ArithmeticException("We got some exception");
        }
        System.out.println("test line ");

        int a = b/c;
        m4();
    }
    void m4()
    {
    }
}