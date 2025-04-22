package multithreading;

public class CreateThreadUsingRunnableScenario1 {

    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        CreateThreadUsingRunnableScenario1 obj = new CreateThreadUsingRunnableScenario1();
        Thread t1 = new Thread();

        System.out.println( "State  of t1: " + t1.currentThread().getState());
        t1.start();
    }
}
