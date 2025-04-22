package multithreading;

public class DaemonThread  implements Runnable{

    @Override
    public void run() {

        if(Thread.currentThread().isDaemon())
        {
            System.out.println(Thread.currentThread() +"  is Daemon Thread ");
        }
        else
        {
            System.out.println(Thread.currentThread() + " is a user (normal) thread ");
        }
    }

    public static void main(String[] args) {

        DaemonThread obj = new DaemonThread();

        Thread t1 = new Thread(obj , "Thread1");
        Thread t2 = new Thread(obj , "Thread2");

        t1.setDaemon(true);

        t1.start();
        t2.start();

        System.out.println("Ending Of Main Thread ");

    }


}
