package java8programming.lambdaexpression;

interface SumCalculator
{
    int add(int a, int b);
}

public class FindSumOfTwoInteger {
    public static void main(String[] args) {

        SumCalculator sumCalculator =(a,b)->
        {
            return  a+b;
        };

         int res =sumCalculator.add(22,3);
        System.out.println("Addition is : " + res);
    }
}
