package multithreading;

// scenchronization in taking only one class
class Thread2 extends Thread
{
   // Thread2 o = new Thread2();

    synchronized  void display()
    {
        for (int i =0; i<3;i++)
        {
            System.out.println("Inside run() method "+ Thread.currentThread().getName() +"  "+ i);

        }
    }

    public  void run()
    {
        display();
    }
}

public class SynchronizationScenarion {
    public static void main(String[] args) {


        Thread2 obj = new Thread2();
        obj.start();
        obj.setName("First");

        Thread2 obj2 = new Thread2();
        obj2.start();
        obj2.setName("second");

        Thread2 obj3 = new Thread2();
        obj3.start();
        obj3.setName("third");

    }
}
/*
Inside run() method second  0
Inside run() method second  1
Inside run() method second  2
Inside run() method third  0
Inside run() method First  0
Inside run() method third  1
Inside run() method First  1
Inside run() method First  2
Inside run() method third  2*/