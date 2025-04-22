package multithreading;

class MyThread5 extends Thread
{
    public void run()
    {
        System.out.println("Hello ");

        System.out.println("Run Thread Name : "+ Thread.currentThread().getName());
    }
}
public class SuspendMethod {
    public static void main(String[] args) {

        MyThread5 o1 = new MyThread5();
        o1.start();

        MyThread5 o2 = new MyThread5();
        o2.start();
        o2.start();  //refer output


    }
}
/*Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:1525)
	at multithreading.SuspendMethod.main(SuspendMethod.java:20)
Hello
Hello
Run Thread Name : Thread-1
Run Thread Name : Thread-0
*/