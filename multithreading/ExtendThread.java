package multithreading;

public class ExtendThread extends Thread {

    public void run()
    {
        for(int i=0; i< 1000; i++)
        {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }

    public static void main(String[] args) {

        ExtendThread obj = new ExtendThread();
        System.out.println("Thread");

        obj.run();


    }
}
