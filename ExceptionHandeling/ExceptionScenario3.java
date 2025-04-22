package ExceptionHandeling;

public class ExceptionScenario3 {

    public static void main(String[] args)
    {
        int a = 20;
        int b = 30;
        int c = 10;
        int x = (a * b)/(a - b + c);
        System.out.println("Result: " +x);  //Arithmetic Exception
    }

}
