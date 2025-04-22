package multithreading;

class TotalEarning extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}
public class WaitNotifyMethod {
    public static void main(String[] args) {

        TotalEarning te = new TotalEarning();
        te.start();
      //  System.out.println("Toatal earning : " +te.total);
        synchronized (te)
        {
            try {
                te.wait();
                System.out.println("Toatal earning : " +te.total);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
