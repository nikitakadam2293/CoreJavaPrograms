package multithreading;

public class MyThread7 extends Thread {

    public void run()
    {
        System.out.println("Running State : ");
    }

    public static void main(String[] args) {

        MyThread7 o = new MyThread7();
        Thread t = new Thread(o);
        System.out.println( " new state : " +o.getState());   //NEW

        o.start();

        System.out.println( "Runnable state : "+  o.getState());   //RUNNABLE


    }
}
