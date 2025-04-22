package multithreading;

class AClass
{
   int i;
    boolean flag = false;
   synchronized void deliver(int i)
   {
       if(flag)

        try {
              wait();
           }
       catch (InterruptedException e) {
               System.out.println(e);

       }

        this.i=i;
       flag =true;
       System.out.println(" Data Deliver : " +i);

       notify();
   }

   synchronized int receiver()
   {

       if(!flag)

           try {
               wait();
           } catch (InterruptedException e) {
               System.out.println(e);
           }
       System.out.println("Data Received = " +i);
       flag =false;

       notify();
       return i;
   }

}

class Thread11 extends Thread
{
    AClass obj;

    Thread11(AClass obj)
    {
        this.obj=obj;
    }

    public void run()
    {
        for(int j =1; j<=2 ;j++ )
        {
            obj.deliver(j);
        }
    }
}

class Thread22 extends Thread
{
    AClass obj;

    Thread22(AClass obj)
    {
        this.obj= obj;

    }

    public void run()
    {
        for(int k=1; k<= 5 ; k++)
        {
            obj.receiver();

        }
    }
}

public class CommunicationOfThread {
    public static void main(String[] args) {

        AClass o = new AClass();

        Thread11 t1 = new Thread11(o);
        Thread22 t2 = new Thread22(o);

        t1.start();
        t2.start();
    }
}
