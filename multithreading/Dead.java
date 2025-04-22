package multithreading;

//  Deadlock condition occure this program but I use join()  it exicution work properly means deadlock
// situation not comming at a time

public class Dead {

    final static String R1 = "Hello";
    final static String R2 ="java";

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(){

            public void run()
            {
                synchronized (R1)
                {
                    System.out.println("T1 aquire lock R1");

                    try
                    {
                        synchronized (R2)
                        {
                            System.out.println("T1 aquire lock R2");
                        }
                    }
                    catch (Exception e){

                    }

                }


            }
        };

        Thread t2 = new Thread(){

            public  void run(){
                synchronized (R2)
                {
                    System.out.println("T2 aquirimg lock R2");

                    try{
                        synchronized (R1)
                        {
                            System.out.println("T2 aquirimg lock R1");
                        }
                    }
                    catch (Exception e)
                    {

                    }

                }



            }
        };

        t1.start();
        t1.join();
        t2.start();
    }
}
