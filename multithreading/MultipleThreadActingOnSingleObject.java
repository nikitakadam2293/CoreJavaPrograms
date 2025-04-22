package multithreading;

public class MultipleThreadActingOnSingleObject implements Runnable {

    String task;
    public MultipleThreadActingOnSingleObject(String task) {
       this.task = task;

    }

    @Override
    public void run() {

        for (int i = 0; i<5 ;i++)
        {
            System.out.println(task + " "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MultipleThreadActingOnSingleObject obj = new MultipleThreadActingOnSingleObject("Hello Java");
        System.out.println(Thread.currentThread());
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);

        t1.start();
        t2.start();
        t3.start();

    }


}
