package multithreading;

class MyThread8 extends Thread
{
    private Object lock;

    MyThread8(String name, Object lock) {
        super(name);
        this.lock = lock;
    }
        @Override
        public void run()
        {
            System.out.println(Thread.currentThread().getName() + "is Trying to aquire current thread ");

            synchronized (lock)
            {
                System.out.println(Thread.currentThread().getName() + "has aquire lock");

                try
                {
                    Thread.sleep(2000);

                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "is realising lock");
            }
        }
    }


public class WaitingStateOfThread {
    public static void main(String[] args) {
        Object lock = new Object();

        MyThread8 thread1 = new MyThread8("Thread1" , lock);
        MyThread8 thread2 = new MyThread8("Thread2" , lock);

        thread1.start();
        thread2.start();



    }
}
