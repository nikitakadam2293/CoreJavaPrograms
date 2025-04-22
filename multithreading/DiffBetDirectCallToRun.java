package multithreading;

public class DiffBetDirectCallToRun extends Thread {
    public static void main(String[] args) {

        DiffBetDirectCallToRun thread = new DiffBetDirectCallToRun();
        thread.setName("Thread1");
        thread.start();

    }

    @Override
    public void run() {

        test();

        test1();
        System.out.println("Running thread is now : "+ Thread.currentThread().getName());
    }
    void test()
    {
        System.out.println("Test method call this from run ");
    }

    static void test1()
    {
        System.out.println(" Static Test method call this from run ");
    }
}
