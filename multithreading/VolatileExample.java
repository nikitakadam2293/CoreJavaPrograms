package multithreading;

class VolatileEx extends Thread {
    public volatile boolean flag = true;

    public void run() {
        System.out.println("Thread start running ");

        while (flag) {

            try {

                System.out.println("Thread going to sleep ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Stop ");
        }
    }
    void stopThread()
    {
        this.flag=false;
    }
}


public class VolatileExample  {

    public static void main(String[] args) {

        VolatileEx obj = new VolatileEx();
        Thread t1 = new Thread(obj);
        t1.start();

        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        obj.stopThread();

    }
}
