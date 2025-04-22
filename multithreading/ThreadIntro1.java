package multithreading;


//diff between thread.start()  and thread.run()

public class ThreadIntro1 extends Thread {
    public static void main(String[] args) {

        ThreadIntro1 thread = new ThreadIntro1();
       // thread.start(); //Runable
        thread.run();
       // thread.stop();

    }

    @Override
    public void run() {
        System.out.println("Thread is a running state now : ");
        try {
            Thread.sleep(1000);  //sleep blocks

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
