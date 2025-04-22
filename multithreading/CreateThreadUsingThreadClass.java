package multithreading;

class ThreadCreate extends Thread
{
    public void run()
    {
        System.out.println("Inside Thread " + Thread.currentThread().getName());
    }

}

public class CreateThreadUsingThreadClass
{
    public static void main(String[] args) {

        ThreadCreate obj = new ThreadCreate();
        Thread t1 = new Thread(obj, "first");  //state new

       // Thread t2 = new Thread(obj, "sec");  //state new




        ThreadCreate obj2 = new ThreadCreate();
        Thread t2 = new Thread(obj2, "second");  //state new

        t1.start();
        t2.start();

        //state dead

        // obj.run();




        /*CreateThreadUsingThreadClass obj1 = new CreateThreadUsingThreadClass();
        Thread t1 = new Thread(obj1, "first");  //state new

        CreateThreadUsingThreadClass obj2 = new CreateThreadUsingThreadClass();
        Thread t2 = new Thread(obj2, "second");  //state new

        t1.start();  //state Runnable
        t2.start();*/


        //state dead
    }
}
