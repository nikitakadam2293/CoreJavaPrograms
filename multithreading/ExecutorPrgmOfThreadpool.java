package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class P implements Runnable
{
    private char charToPrnt;

    P(char c)
    {
        this.charToPrnt = c;
    }
    @Override
    public void run() {
        for (int i=1;i<4;i++)
        {
            System.out.println(charToPrnt);
        }
    }
}

class R  implements Runnable
{
    private int a;

    R(int a)
    {
        this.a=a;
    }

    @Override
    public void run() {

        for(int i= 1; i<4; i++)
        {
            System.out.println(a);
        }
    }
}

public class ExecutorPrgmOfThreadpool {
    public static void main(String[] args) {

     //   ExecutorService executor  = Executors.newFixedThreadPool(3);  //asynchronously output comes

        ExecutorService executor  = Executors.newFixedThreadPool(1);  // in this way synchronously output comes

        P t1 = new P('a');
        P t2 = new P('b');

        R t3 = new R(5);

        executor.execute(t1);
        executor.execute(t2);
        executor.execute(t3);

        executor.shutdown();



    }
}
