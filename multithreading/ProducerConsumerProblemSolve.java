package multithreading;

class Q
{
    int i ;
    boolean flag = false;

    synchronized  void producer(int i)
    {
        if(flag)

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        this.i=i;
        System.out.println("Producer : " +i);

        flag=true;
        notify();
    }

    synchronized int consumer()
    {

        if(!flag)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        System.out.println("Consumer = "+i);
        flag =false;
        notify();
        return i;
    }
}



class Producer extends Thread
{
    Q q;

    Producer(Q q)
    {
        this.q =q;
    }

    public void run()
    {
        for(int i =1; i<=4; i++)
        {
            q.producer(i);
        }
    }
}

class Consumer extends Thread
{
    Q q;

    Consumer(Q q)
    {
        this.q=q;
    }

    public void run() {
        for (int i = 1; i <= 4; i++) {
            q.consumer();
        }
    }
}

public class ProducerConsumerProblemSolve {

    public static void main(String[] args) {

        Q q = new Q();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }
}
