package java8programming.methodreference;

import java.time.LocalDate;

@FunctionalInterface
interface MethodRefInterface
{
        void test();
}

class MethodRefClass
{
    /* +++++++++++++++++++++++++++

        Argument same of interface method and class method

    +++++++++++++++++++++++++++ */

    public static void m1()
    {
        System.out.println("Inside class static method");
        System.out.println("++++  Second line ====");

        LocalDate now = LocalDate.now();
        System.out.println(now);
    }

    public static void threadTask()
    {
        for (int i=1; i<=10; i++)
        {
            System.out.println(i*2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  void printNumber()
    {
        for(int i= 1; i<=10; i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



}
public class MethodReferece {

    public static void main(String[] args) {

        System.out.println("Method Reference : ");

        System.out.println("================================");

        //refer to  static method
        // ClassName :: MethodName
        MethodRefInterface methodRefInterface = MethodRefClass::m1;
        methodRefInterface.test();
        // in above refering class method and provide implementation
        // to interface method
        // Argument same of interface method and class method

        System.out.println("--------------");
        Runnable runnable= MethodRefClass :: threadTask;
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("--------------");

        // refer non static method using
        // object:: methodname
        MethodRefClass ob = new MethodRefClass();
        Runnable runnable1 = ob::printNumber;

        Thread thread1 = new Thread(runnable1);
        thread1.start();



        System.out.println("================================");

        MethodRefInterface annonymous = new MethodRefInterface() {
            @Override
            public void test() {
                System.out.println("Using Anonymous ");
            }
        };
        annonymous.test();

        MethodRefInterface lambda = ()->{
            System.out.println("Using Lanmbda");
        };
        lambda.test();

    }
}

