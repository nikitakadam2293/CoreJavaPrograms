package multithreading;

public class YieldMethod extends Thread{

    public void run()
    {
        for(int i = 0; i<3 ; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }

        System.out.println("Hello: " + Thread.activeCount());  //Active count : 2

    }

    public static void main(String[] args) {

        YieldMethod obj = new YieldMethod();

        YieldMethod obj1 = new YieldMethod();

        System.out.println("Active count : " + Thread.activeCount());  //Active count : 2


        obj.start();
        obj1.start();

        for(int i=0; i<3 ;i++) {
            obj.yield();

            System.out.println(Thread.currentThread().getName() + " main ");
        }

        System.out.println("Active count : " + Thread.activeCount());  //Active count : 2
    }
}
