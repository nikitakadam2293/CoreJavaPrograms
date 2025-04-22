package multithreading;

import java.util.Scanner;

class SynchronizeClass
{
    Scanner sobj = new Scanner(System.in);

    public int arr[];

    SynchronizeClass(int size)
    {
         arr = new int[size];

    }
    public void  accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");

        for(int i=0; i<this. arr.length;i++)
        {
          this.arr[i]=sobj.nextInt();
        }
    }
   public  void display()
    {
        for(int i = 0; i<this.arr.length;i++)
        {
            System.out.println(this.arr[i]);
        }
    }



   synchronized public void displayEven()
    {

        System.out.println("Display Even : ");
        for(int i=0; i<this.arr.length;i++)
        {
            if(this.arr[i]%2 ==0)
            {
                System.out.println(this.arr[i]);
            }
        }
    }
}
class ThreadSynchronization extends Thread
{
     //SynchronizeClass ref = new SynchronizeClass(4);

    public SynchronizeClass ref;

    public ThreadSynchronization(SynchronizeClass obj )
    {
        this.ref=obj;
    }

    public void run()
    {
        this.ref.displayEven();
    }
}


public class Syncronization {
    public static void main(String[] args) throws InterruptedException {

        SynchronizeClass obj1 = new SynchronizeClass(4);
        SynchronizeClass obj2 = new SynchronizeClass(4);

        obj1.accept();
        obj1.display();

        obj2.accept();
        obj2.display();

        ThreadSynchronization tobj1 = new ThreadSynchronization(obj1);
        ThreadSynchronization tobj2 = new ThreadSynchronization(obj2);

        Thread t1 =new Thread(tobj1);
        Thread t2 =new Thread(tobj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("End of main thread");




      /*  SynchronizeClass obj = new SynchronizeClass(4);
        obj.accept();
        obj.display();
        obj.displayEven();*/
    }
}

