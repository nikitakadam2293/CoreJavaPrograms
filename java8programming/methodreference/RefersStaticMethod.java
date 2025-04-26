package java8programming.methodreference;

import java.util.Comparator;
import java.util.function.IntBinaryOperator;

class MathUnit
{
    public static int multiply(int a, int b)
    {
        return a*b;
    }
}
public class RefersStaticMethod
{
    public static void main(String[] args) {

        IntBinaryOperator multiply = MathUnit::multiply;

        int result = multiply.applyAsInt(2,4);

        System.out.println(result);
    }
}
