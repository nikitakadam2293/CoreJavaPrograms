package multithreading;

class  ShowRoom
{

    int i;  // i =car
    boolean flag = false;   //showroom is full

   synchronized  public void producer(int i)
    {
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        this.i = i;
        flag = true;   // showroom is not full
        System.out.println("Producer car : "+i);
        notify();
    }

    synchronized public int consumer()
    {
        if(!flag)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        flag =false;
        System.out.println("Consumer Car = " +i);
        notify();
        return i;
    }
}

class Producer1 extends Thread
{
    ShowRoom o ;

    //this i =i;

    Producer1( ShowRoom o)
    {
        this.o=o;
    }

    public void run()
    {
        for(int i= 1; i<=4; i++)
        {
            o.producer(i);
        }
    }
}

class Consumer1 extends Thread
{
    ShowRoom o ;

    Consumer1(ShowRoom o)
    {
        this. o=o;
    }
    public void run()
    {
        for(int i=1; i<=4; i++)
        {
            o.consumer();
        }

    }
}
public class ProducerConsumer1 {
    public static void main(String[] args) {


        ShowRoom obj = new ShowRoom();

        Producer1 t1 = new Producer1(obj);
        Consumer1 t2 = new Consumer1(obj);

        t1.start();
        t2.start();

    }
}
