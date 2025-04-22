package multithreading;

public class MultiTaskingWithSingleThread extends Thread {

    int a =10;
    int b=5;

    public void run()
    {
        addition();  //task1
        substraction(); // task2
        multiplication();  //task3
        division();

    }

     void addition()
     {
         System.out.println("add " + (a+b));
     }

    void substraction()
    {
        System.out.println("sub " + (a-b));
    }

    void multiplication()
    {
        System.out.println("mul " + (a*b));
    }

    //a single thread t is used to execute four tasks one by one.
    void division()
    {
        System.out.println("div " + (a/b));
    }

    public static void main(String[] args) {

        MultiTaskingWithSingleThread obj = new MultiTaskingWithSingleThread();

        Thread t = new Thread(obj);
        t.start();

    }
}
