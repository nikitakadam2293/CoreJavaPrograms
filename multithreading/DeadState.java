package multithreading;

class MyThread10 extends Thread
{
   public void run()
   {
       System.out.println(Thread.currentThread().getName() + " is running ");
       try
       {
           Thread.sleep(1000);
       }
       catch (InterruptedException e)
       {
           e.printStackTrace();
       }
       System.out.println(Thread.currentThread().getName() + "  has finish exicution ");
   }
}
public class DeadState {
    public static void main(String[] args) {

        MyThread10 obj = new MyThread10();
        obj.start();
        System.out.println("Is thread is alive first : " + obj.isAlive());

        try
        {
            obj.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Is thread is alive : " + obj.isAlive());
        System.out.println("Thread has dead state");
    }
}
