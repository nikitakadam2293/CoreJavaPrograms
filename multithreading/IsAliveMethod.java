package multithreading;

class MyThread4 extends Thread
{
    public void run()
    {
        try {
            Thread.sleep(300);
            System.out.println("run : "+ Thread.currentThread().isAlive());

        } catch (InterruptedException e) {
        }
    }
}
public class IsAliveMethod {

    public static void main(String[] args) {

       // MyThread4 obj
    }
}
