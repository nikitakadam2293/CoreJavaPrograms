package multithreading;

public class MyThread6 extends Thread{
   public void run()
   {
       Thread th1 = Thread.currentThread();
       System.out.println(th1);
       System.out.println("run method");

   }
    public static void main(String[] args) {

        System.out.println("main thread start");
        Thread th2 = Thread.currentThread();
        System.out.println(th2);

        int c = Thread.activeCount();
        System.out.println("active count : " +c);  //2


        MyThread6 obj = new MyThread6();
        int c2 = Thread.activeCount();
        System.out.println(" c2 : " + c2);  //2

        obj.start();

    }


}
