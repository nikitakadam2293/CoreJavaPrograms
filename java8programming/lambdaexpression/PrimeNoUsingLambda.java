package java8programming.lambdaexpression;
interface PrimeNumber
{
    boolean primeNo(int n);
}

public class PrimeNoUsingLambda {
    public static void main(String[] args) {

        int no=13;

        PrimeNumber primeNumber = n->
        {
            if(n<=1) {
                return false;
            }
            for (int i=2; i<= Math.sqrt(n); i++)
            {
                if(n% i == 0)
                {
                    return false;
                }

            }
            return true;


        };

        System.out.println("Prime No ? " + primeNumber.primeNo(no));  // Prime No ? true

    }
}
