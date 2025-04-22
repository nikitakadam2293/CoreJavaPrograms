package java8programming.lambdaexpression;


//interface
// class

// 1) class implement interface => override interface method
//  2) anonymous class implementation
//   3) lambda expression

interface TestFunctional
{
    void test();

}

interface AdditionFunction
{
    int addition(int a, int b, int c);
}

public class IntroToLambada  {

    /*@Override
    public void test() {
        System.out.println("Test message");
    }*/

    public static void main(String[] args) {

        TestFunctional testFunctional =()->{

            System.out.println("Test message using lambda");
        };

        testFunctional.test();

        System.out.println("=========");

        AdditionFunction additionFunction = (a,b,c)->
        {
            System.out.println("value a : " +a);
            System.out.println("value b : " +b);
            System.out.println("value c : " +c);
            return a+b+c;
        };

        int result = additionFunction.addition(11,22,33);

        System.out.println("Result : " + result);
    }
}
