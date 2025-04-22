package ExceptionHandeling;

class Test1 extends Exception{

}

class Test2 extends Exception{}

class Test3 extends  Exception{}


public class ThrowScenario3 {
    public static void main(String[] args) {

        int num = 1;

        for (num = 1; num <= 10; num++) {
            try {
                if (num == 5)
                    throw new Test1();
                else if (num< 2)
                    throw new Test2();
                else if (num > 9)
                    throw new Test3();
            }
            catch (Exception e)
            {
                System.out.println("Caught an Ex");
            }
        }
    }
}