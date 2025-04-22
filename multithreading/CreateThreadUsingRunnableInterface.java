package multithreading;

class CreateThreadUsingRunable implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println("hello");
    }
}

public class CreateThreadUsingRunnableInterface {

    public static void main(String[] args) {


    CreateThreadUsingRunable obj =new  CreateThreadUsingRunable();
    Thread t1 = new Thread(obj );

    CreateThreadUsingRunable obj1 =new  CreateThreadUsingRunable();
    Thread t2 = new Thread(obj1, "second" );

    t1.start();
   t2.start();

   // we exicute this program two times run method call
/*
Thread-0
hello
second
hello
*/
}
}