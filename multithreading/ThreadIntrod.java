package multithreading;

public class ThreadIntrod extends Thread
{
    public static void main(String[] args) {

        ThreadIntrod thread = new ThreadIntrod();
        thread.start(); //Runable
        thread.start();

        //  thread.stop();

    }

    @Override
    public void run() {
        System.out.println("Thread is a running state now : ");
        try {
            Thread.sleep(1000);  //sleep blocks

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}


/*
we can not start one thread two times

 thread.start(); //Runable
thread.start();

Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:1525)
	at multithreading.ThreadIntrod.main(ThreadIntrod.java:9)
Thread is a running state now :
*/