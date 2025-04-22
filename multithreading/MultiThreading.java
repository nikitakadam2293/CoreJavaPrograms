package multithreading;

class MyThread extends Thread
{

    public void run()
    {
        for (int i =1; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName()+ "  :" + i );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

                System.out.println(e);
            }
        }
    }

}

public class MultiThreading {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();


        /*
        * In the main() method, we have created two threads (t1 and t2) and
        *  started using the start() method, which internally calls the run() method.
        * Both threads run concurrently, and displays messages independently.*/

    }
}

// Thread 1 and 2 exicute after some time bcz sleep()
// and also sequence changes

/*
Thread-1  :1
Thread-0  :1
Thread-1  :2
Thread-0  :2
Thread-1  :3
Thread-0  :3
Thread-0  :4
Thread-1  :4
Thread-0  :5
Thread-1  :5*/