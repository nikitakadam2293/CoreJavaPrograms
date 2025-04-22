package multithreading;

class ThreadPriority extends Thread
{
     synchronized public void run()
    {
        System.out.println("Inside run Name of Thread : "+ Thread.currentThread().getName());
        System.out.println("Inside run priority "+ Thread.currentThread().getName() + "  is "+Thread.currentThread().getPriority());
    }
}

public class ThreadPriority1 {
    public static void main(String[] args) {

        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());

        ThreadPriority obj1 = new ThreadPriority();
        Thread t1 = new Thread(obj1 );
        t1.start();

        ThreadPriority obj2 = new ThreadPriority();
        Thread t2 = new Thread(obj2 );
        t2.start();

        t1.setPriority(2);
        t2.setPriority(10);




    }
}
