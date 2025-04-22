package multithreading;

class SyncnonizeDisplay
{

    synchronized void display()
    {
        for (int i =0; i<3;i++)
        {
            System.out.println("Inside run() method "+ Thread.currentThread().getName() +"  "+ i);

        }

    }
}

class ThreadSynchonization extends Thread
{
    public SyncnonizeDisplay ref =new SyncnonizeDisplay();


    /*ThreadSynchonization(SyncnonizeDisplay ref)
    {
        this. ref = ref;
    }*/

    public void run()
    {
        this.ref.display();
    }
}

public class IntroToMulThreading {
    public static void main(String[] args) throws InterruptedException {

        SyncnonizeDisplay obj = new SyncnonizeDisplay();


        ThreadSynchonization  thread1 = new ThreadSynchonization();  //obj
        thread1.start();
        thread1.setName("Ramesh");

        thread1.join();

        ThreadSynchonization  thread2 = new ThreadSynchonization(); //obj
        thread2.start();
        thread2.setName("Suresh");

        thread2.join();

        ThreadSynchonization  thread3 = new ThreadSynchonization(); //obj
        thread3.start();
        thread3.setName("Kamlesh");


    }
}
