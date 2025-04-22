package multithreading;

class X
{
    void display1(X obj2)
    {
        System.out.println("Thread1 waiting for thread2 to release lock");
        synchronized (obj2)
        {
            System.out.println("Deadlock Occure ");
        }
    }
    void display2(X obj1)
    {
        System.out.println("Thread2 waiting for thread1 to  release lock");
        synchronized (obj1)
        {
            System.out.println("Deadlock Occure");
        }
    }
}

class Thread3 extends Thread
{
    X obj1;
    X obj2;

    Thread3(X obj1, X obj2)
    {
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public void run()
    {
        synchronized (obj1)
        {
           try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

           obj2.display2(obj2);
        }
    }
}
class Thread4 extends Thread
{
    X obj1;
    X obj2;

    Thread4(X obj1,X obj2)
    {
        this.obj1=obj1;
        this.obj2=obj2;
    }
    public void run()
    {
        synchronized (obj2)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            obj1.display1(obj1);
        }
    }

}
public class Deadlock1 {
    public static void main(String[] args) {

        X obj1 = new X();
        X obj2= new X();

        Thread3 t1 = new Thread3(obj1,obj2);

        Thread4 t2  = new Thread4(obj1,obj2);

        t1.start();
        t2.start();
    }
}