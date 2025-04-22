package multithreading;


    public class IntroToMultithreading9Answer extends Thread {
       // private static final Object lock = new Object(); // Shared lock object

        @Override
        public void run() {
            /*
            *  synchronized (IntroToMultithreading9Answer.lock) => uncomment 5 no line and use this line
            * also give proper output
            * */

            synchronized (IntroToMultithreading9Answer.class) { // Now all threads share the same lock
                for (int i = 0; i < 3; i++) {
                    System.out.println("Inside run() method " + Thread.currentThread().getName() + " and index is " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        public static void main(String[] args) {
            IntroToMultithreading9Answer thread1 = new IntroToMultithreading9Answer();
            thread1.setName("Ramesh");

            IntroToMultithreading9Answer thread2 = new IntroToMultithreading9Answer();
            thread2.setName("Suresh");

            IntroToMultithreading9Answer thread3 = new IntroToMultithreading9Answer();
            thread3.setName("Kamlesh");

            thread1.start();
            thread2.start();
            thread3.start();
        }
    }




