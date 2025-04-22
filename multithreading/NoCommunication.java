package multithreading;

class A
{
    int i;

    synchronized void deliver(int i)
    {
        this.i = i;
        System.out.println("Data Deliver : "+ i);
    }

    synchronized  int receiver()
    {
        System.out.println("Data Receiver " +i);
        return i;
    }

}
class ThreadX  extends Thread
{
    A obj;

    ThreadX(A obj)
    {
        this.obj=obj;
    }

    public void run()
    {
        for(int j=1; j<= 5 ; j++)
        {
            obj.deliver(j);
        }
    }
}

class ThreadY extends Thread
{
    A obj;

    ThreadY(A obj)
    {
        this.obj=obj;
    }

    public void run()
    {
        for(int k=0; k<=5; k++)
        {
            obj.receiver();
        }
    }
}

public class NoCommunication {
    public static void main(String[] args) {

        A obj = new A();

        ThreadX t1 = new ThreadX(obj);
        ThreadY t2 = new ThreadY(obj);

        t1.start();
        t2.start();
    }
}
