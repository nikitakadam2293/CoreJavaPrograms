package java8programming.lambdaexpression;

interface ExceptionEx
{
    void show(int a, int b);
}

public class ExceptionInLambda {

    public static void main(String[] args) {

        ExceptionEx ex =(a,b)->{

            int i = 10;
            int j=2;
            int c=0;
            try
            {
                 c= i/j;
            }
            catch (NullPointerException e)
            {
                System.out.println("Null pointer exception occure : ");
            }
            finally {
                //System.exit(0);
                System.out.println("Finally ....");
            }
            System.out.println("Result : "+ c);

        };
          ex.show( 10,0);
    }


}
