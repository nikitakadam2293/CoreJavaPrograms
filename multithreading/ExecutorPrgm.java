package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Addition implements Runnable
{
    int a;
    int b;
    Addition(int a, int b)
    {

        this.a=a;
        this.b=b;

    }
    public void run()
    {
        System.out.println("Addition : " + (a+b));
    }
}

class Substraction implements Runnable
{
    int a;
    int b;

    Substraction(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public void run()
    {
        System.out.println("Sub : " + (a-b));
    }
}

public class ExecutorPrgm {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(1);

        executor.execute(new Addition(1,2));
        executor.execute(new Substraction(4,2));

        executor.shutdown();
    }
}
