package ExceptionHandeling;

public class IntroToException {

    int divide(int a, int b)
    {
        int c = a/b;
        return  c;
    }

    public static void main(String[] args) {
        IntroToException obj = new IntroToException();
        int result = obj.divide(100,10);
        System.out.println("result is  " +result);

        int result1 = obj.divide(100,0);
        System.out.println("another  result is " +result1);
    }
}
