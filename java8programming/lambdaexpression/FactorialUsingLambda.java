package java8programming.lambdaexpression;

import java.util.function.LongUnaryOperator;

public class FactorialUsingLambda {
    public static void main(String[] args) {
        LongUnaryOperator  fact = n->{

            long result = 1;
            for(long i = 1; i<n ; i++)
            {
               result=  result * i;
            }

            return  result;
        };
        System.out.println("Factorial : " + fact.applyAsLong(5));
    }
}
