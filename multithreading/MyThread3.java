package multithreading;

/// Use interface  Runnable
public class MyThread3 implements Runnable {
    @Override
    public void run()
    {
        System.out.println("Run method ");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {

        MyThread3 obj = new MyThread3();
        obj.run();

    }

    /*@Override
    public void run() {

    }*/
}
/*
Run method
main

* */