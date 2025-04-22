package multithreading;

public class Scenachronizaton3  extends  Thread{

     public void run()
    {
        synchronized (this)
        {
        for(int i =0; i<4;i++)
        {
            System.out.println(Thread.currentThread().getName()+   i);
        }
    }
    }

    public static void main(String[] args) {


        Scenachronizaton3 t1 = new Scenachronizaton3();
        t1.start();
        t1.setName("First");
        t1.setPriority(1);

        Scenachronizaton3 t2 = new Scenachronizaton3();
        t2.start();
        t2.setName("sec");
        t2.setPriority(2);

        Scenachronizaton3 t3 = new Scenachronizaton3();
        t3.start();
        t3.setName("third");
        t3.setPriority(3);

        Scenachronizaton3 t4 = new Scenachronizaton3();
        t4.start();
        t4.setName("four");

        t4.setPriority(4);

    }
}
