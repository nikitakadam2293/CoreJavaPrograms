package multithreading;


// extend thraad - our class directly thread
public class ThreadExtend extends Thread {
    public static void main(String[] args) {

        ThreadExtend thread = new ThreadExtend();
        thread.setName("Thread1");
      //  thread.getName();

        thread.start();
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
