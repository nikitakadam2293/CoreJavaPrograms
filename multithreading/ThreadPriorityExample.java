package multithreading;

class ThreadPriorityPr extends Thread
{
   public void run()
   {
       System.out.println("Inside thread : "+ Thread.currentThread().getName());
       System.out.println("Thread Priority : " + Thread.currentThread().getPriority());
   }
}
public class ThreadPriorityExample {

    public static void main(String[] args) {

        System.out.println("Main Thread Priority : "+ Thread.currentThread().getPriority());
        ThreadPriorityPr obj1 = new ThreadPriorityPr();
        Thread t1 = new Thread(obj1);

        ThreadPriorityPr obj2 = new ThreadPriorityPr();
        Thread t2 = new Thread(obj2);


    }
}
