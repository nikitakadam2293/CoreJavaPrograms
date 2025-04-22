package multithreading;

class Showroom1
{
    int i;
    boolean flag = false; //showroom Full


    synchronized public void produce(int i)
    {
        if(flag)
        {
            try {
               wait();
             } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        this.i= i;
            flag = true;  //false
            System.out.println("Produce car "+i);
            notify();
    }
    synchronized public int consume()
    {
        if(!flag)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        flag =false;
        System.out.println("Consume Car" +i);
        notify();
        return i;
    }
}

public class ProducerConsumerProblemUsingAnonymousClass {
    public static void main(String[] args) {

        Showroom1 o = new Showroom1();

        //for producer
        Thread t1 = new Thread(){

            public  void run()
            {
                for (int i = 0 ; i<=2; i++)
                {
                    o.produce(i);

                }
            }
        };

        //for consumer
        Thread t2 = new Thread(){
            public  void run()
            {
                for (int i = 0 ; i<=2; i++)
                {
                    o.consume();
                }
            }
        };

        t1.start();
       t2.start();
    }
}
