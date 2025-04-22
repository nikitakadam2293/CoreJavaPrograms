package multithreading;

public class IntroToMultithreading9 extends Thread{

    public static void main(String[] args) throws InterruptedException {
        IntroToMultithreading9 thread1 = new IntroToMultithreading9();
        thread1.setName("Ramesh");

        IntroToMultithreading9 thread2 =  new IntroToMultithreading9();
        thread2.setName("Suresh");

        IntroToMultithreading9 thread3 =  new IntroToMultithreading9();
        thread3.setName("Kamlesh");

        thread1.start();//OS scheduler  => round robin

        /*try {
            thread1.wait();
        } catch (InterruptedException ex){
            System.out.println("got exception ");
        }*/

        //thread1.join();
        thread2.start();
      /*  try {
            thread2.wait();
        } catch (InterruptedException ex){
            System.out.println("got exception ");
        }*/
        // thread2.join();
        thread3.start();
        //thread3.wait();

        //synchronization
        //Aarya  => 10000 => 4 way  => 40000
    }

    @Override
    public void run() {
        //acquired lock on object?
        //how do we achieve it?
        //explain this synchronized (IntroToMultiThreading.this)

        synchronized (IntroToMultithreading9.this) {
            for(int i = 0; i < 3; i++){
                System.out.println("Inside run() method "+Thread.currentThread().getName() + " and index is "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        //this.notify();

    }
}
