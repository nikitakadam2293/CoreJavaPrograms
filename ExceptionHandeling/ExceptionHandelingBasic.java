package ExceptionHandeling;

public class ExceptionHandelingBasic {
    int divide(int a, int b)
    {
       int c = a/b;
        return  c;
    }

    public static void main(String[] args) {
        ExceptionHandelingBasic obj = new ExceptionHandelingBasic();


       try
       {
           int result = obj.divide(100,0);
           System.out.println("result is  " +result);
       }
       catch (Exception ex)
       {
           System.out.println("We got exception in try block  " + ex.getMessage());

           /*int z= 2+32;
           System.out.println("z "+z);*/
          /* System.out.println("Stack trace");
           ex.printStackTrace();*/

          // System.out.println("We got exception in try block" + ex.getStackTrace()); //We got exception in try block[Ljava.lang.StackTraceElement;@568db2f2

       }


        int result1 = obj.divide(100,10);
        System.out.println("another  result is " +result1);
    }
}
/*We got exception in try block
another  result is 10 */