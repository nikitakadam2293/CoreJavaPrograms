package multithreading;

public class DeadlockIMP {

    final static String R1 = "Hello Welcome to Scaller";
    final static String R2 = "Visit Scaller";

    public static void main(String[] args) {

        //creating Thread T1
        Thread T1 =new Thread() {

            //implementing run method
            public void run() {

                //thread t1 lockimg the R1 resourse
                synchronized (R1) {
                    System.out.println("Thread T1 locked -> Resourse R1 ");

                    try {
                       // thread t1 lockimg the R2 resourse
                        synchronized (R2) {
                            System.out.println("Thread T1 locked -> Resourse R2");

                        }
                    } catch (Exception e) {
                    }
                }
            }
        };

        //creating thread t2
        Thread T2 =new Thread(){

            //implementing run method
            public void run() {

                //thread T2 locking the R2 resoure
                synchronized (R1) {
                    System.out.println("Thread T2 locked -> Resourse R1 ");

                    synchronized (R2) {
                        System.out.println("Thread T2 locked -> Resourse R2 ");
                    }

                }
            }
        };

        //starting both the threads

        T1.start();
        T2.start();

    }
}
