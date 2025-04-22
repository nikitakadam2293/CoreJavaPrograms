package multithreading;

class MyThread1 extends Thread
{
    public void run()
    {
        for(int i =0; i<10; i++)
        {
            System.out.println("Value of i  : "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);

            }
        }
    }
}


public class SleepMethod {
    public static void main(String[] args) throws InterruptedException {

        MyThread1 obj = new MyThread1();
        Thread t1 = new Thread(obj);

        MyThread1 obj1 = new MyThread1();
        Thread t2 = new Thread(obj1);

        t1.start();
        t1.join();
        t2.start();
    }
}
/*
* Value of i  : 0
Value of i  : 1
Value of i  : 2
Value of i  : 3
Value of i  : 4
Value of i  : 5
Value of i  : 6
Value of i  : 7
Value of i  : 8
Value of i  : 9
Value of i  : 0
Value of i  : 1
Value of i  : 2
Value of i  : 3
Value of i  : 4
Value of i  : 5
Value of i  : 6
Value of i  : 7
Value of i  : 8
Value of i  : 9

this output comes due to join() method
*
* */