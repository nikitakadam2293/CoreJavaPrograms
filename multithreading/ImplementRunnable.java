package multithreading;
// if  implements Runnable our class is instance of Runnable
public class ImplementRunnable implements Runnable {

    public static void main(String[] args) {

        ImplementRunnable thread = new ImplementRunnable();
        Thread thread1 = new Thread(thread);

        thread1.setName("Thread1");
        //  thread.getName();

        thread1.start();
       // thread1.run();
    }

    @Override
    public void run() {
        System.out.println("Thread is Running : "+Thread.currentThread().getName());

        test();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    void test()
    {
        System.out.println("call this from run ");
    }

}
