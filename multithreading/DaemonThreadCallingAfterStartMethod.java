package multithreading;

public class DaemonThreadCallingAfterStartMethod implements Runnable {

    public  void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(Thread.currentThread() + " is a daemon thread ");

        }
        else
        {
            System.out.println(Thread.currentThread() + " is not  daemon thread ");

        }
    }


    public static void main(String[] args) {

        DaemonThreadCallingAfterStartMethod o = new DaemonThreadCallingAfterStartMethod();

        Thread t1 = new Thread(o,"fir");
        t1.start();
       // t1.setDaemon(true);

        Thread t2 = new Thread(o , "sec");
        t2.setDaemon(true);
        t2.start();





    }
}
/*
* Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.setDaemon(Thread.java:2239)
	at multithreading.DaemonThreadCallingAfterStartMethod.main(DaemonThreadCallingAfterStartMethod.java:17)
Thread[#22,Thread-0,5,main] is a daemon thread
*/

