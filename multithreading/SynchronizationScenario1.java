package multithreading;
class Calculation
{
    synchronized void  operation()
    {
        int sum =0;

        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println("Sum is : "+ sum);
    }
}

 class Thread1 extends Thread
 {
     Calculation o = new Calculation();
     public void run()
     {

         o.operation();

     }
 }
public class SynchronizationScenario1 {
    public static void main(String[] args) {


        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        Thread1 t3 = new Thread1();

        t1.start();
        t2.start();
        t3.start();
    }
}
