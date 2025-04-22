package multithreading;

public class VolatileKeyword extends Thread {

    private static volatile boolean running = true; // Shared volatile variable

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            if (!running) {  // Check if running is false, terminate the loop
                break;
            }
            System.out.println("Inside run() method " + Thread.currentThread().getName() + " and index is " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        VolatileKeyword thread1 = new VolatileKeyword();
        thread1.setName("Ramesh");

        VolatileKeyword thread2 = new VolatileKeyword();
        thread2.setName("Suresh");

        VolatileKeyword thread3 = new VolatileKeyword();
        thread3.setName("Kamlesh");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(200); // Let the threads run for a while
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        running = false; // Stop all threads
        System.out.println("Main thread set running to false.");
    }
}
