package multithreading;

//Answer code
class SyncnonizeDisplay1
{

    synchronized void display()
    {
        for (int i =0; i<3;i++)
        {
            System.out.println("Inside run() method "+ Thread.currentThread().getName() +"  "+ i);

        }

    }
}

class ThreadSynchonization1 extends Thread
{
    public SyncnonizeDisplay1 ref ;


    ThreadSynchonization1(SyncnonizeDisplay1 ref)
    {
        this. ref = ref;
    }

    public void run()
    {
        this.ref.display();
    }
}

public class IntroToMulThreading1 {
    public static void main(String[] args) throws InterruptedException {

        SyncnonizeDisplay1 obj = new SyncnonizeDisplay1();


        ThreadSynchonization1  thread1 = new ThreadSynchonization1(obj);
        thread1.start();
        thread1.setName("Ramesh");

       // thread1.join();

        ThreadSynchonization1  thread2 = new ThreadSynchonization1(obj);
        thread2.start();
        thread2.setName("Suresh");

      //  thread2.join();

        ThreadSynchonization1  thread3 = new ThreadSynchonization1(obj);
        thread3.start();
        thread3.setName("Kamlesh");


    }
}
/*
Inside run() method Ramesh  0
Inside run() method Ramesh  1
Inside run() method Ramesh  2
Inside run() method Kamlesh  0
Inside run() method Kamlesh  1
Inside run() method Kamlesh  2
Inside run() method Suresh  0
Inside run() method Suresh  1
Inside run() method Suresh  2

* */
//============================================

/*
If use join it maintain the order  :-
Ramesh
Suresh
Kamlesh


Inside run() method Ramesh  0
Inside run() method Ramesh  1
Inside run() method Ramesh  2
Inside run() method Suresh  0
Inside run() method Suresh  1
Inside run() method Suresh  2
Inside run() method Kamlesh  0
Inside run() method Kamlesh  1
Inside run() method Kamlesh  2

*
* */