package ExceptionHandeling;

public class WhyToUseFinallyBlock {

    void test() {
        System.out.println("Test method called");

    }

    public static void main(String[] args) {
        System.out.println('c');  //c
        System.out.println("c");   //c

        System.out.println('c' +100);  //199  //c ASCII 99 + 100 =199
        System.out.println("c" +100);   //c100


        try {
            WhyToUseFinallyBlock obj = new WhyToUseFinallyBlock();    //null;
            obj.test();  // NPE

            int a = 100 / 10;  //AE

            int[] intArray = new int[5];

           // intArray[7] = 100;   //AIOE
            System.out.println("Array  value "+ intArray[3]);

            String str = "java";
//            char cc = str.charAt(10);
            char cc = str.charAt(2);

            System.out.println(cc);

        } catch (ArithmeticException | NullPointerException |ArrayIndexOutOfBoundsException ee) {
            System.out.println("Got Arithmetic Exception" + ee.getMessage());

        } catch (Exception exception) {
            System.out.println("Caught in generic catch block");
        }
        finally {
            System.out.println("This will always exicute weather exception occure or not");
        }

        int b = 100 / 10;
        System.out.println("value of b " + b);
    }
}