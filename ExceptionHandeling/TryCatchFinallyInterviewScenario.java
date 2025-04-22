package ExceptionHandeling;

public class TryCatchFinallyInterviewScenario {

    int main1(int a)
    {
       // int a;
        try
        {
            int b = 10;

            return b;


        }
        catch (Exception ex)
        {
            a=100;
            return 100;
        }
        finally {
            /*a= 200;
            return a;
*/
            int c= 200;
            return c;


        }

    }

    public static void main(String[] args) {
        TryCatchFinallyInterviewScenario obj = new TryCatchFinallyInterviewScenario();

        int a=0;
        int result = obj.main1( a);
        System.out.println(" a "+result);   // a 200



    }
}
