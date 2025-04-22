package ExceptionHandeling;

public class ThrowScenario2 {
    public static void main(String[] args) {
        int num = 1;

        for( num = 1; num<= 10;num++)
        {
            try
            {
                if(num== 5)
                    throw new ArithmeticException("Arithmetic Exception");
                else if (num< 2)
                     throw  new RuntimeException("Runtime Exception") ;
                else if (num > 9 )
                      throw new NullPointerException("Null pointer exception");


            } catch (Exception e) {
                System.out.println("caught exception");
                System.out.println(e.getMessage());
            }
        }
    }
}
