package multithreading;

public class MyThread2 extends Thread
{
    public static void main(String[] args) {

        MyThread2 obj1 = new MyThread2();
        Thread t1 = new Thread(obj1, "first");

        MyThread2 obj2 = new MyThread2();
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName()); //main
    }
}
