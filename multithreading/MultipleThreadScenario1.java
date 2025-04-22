package multithreading;

class MyThread12 implements Runnable
{
    public void run()
    {

        for (int i=0; i< 5; i++)
        {
            System.out.println("First Child Thread " +i);
        }
        System.out.println("First Child Existed ");

    }
}

class MyThread13 implements Runnable
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Second Child Thread "+ i);
        }
        System.out.println("Second Child Existed ");
    }
}
public class MultipleThreadScenario1 {
    public static void main(String[] args) {

        MyThread12 obj1 = new MyThread12();
        Thread t1 = new Thread(obj1);
        t1.start();

        MyThread13 obj2 = new MyThread13();
        Thread t2 = new Thread(obj2);
        t2.start();

        int j=0;
        while (j<5)
        {
            System.out.println(j);
            j++;
        }
    }
}
/*0
1
2
3
4
Second Child Thread 0
Second Child Thread 1
Second Child Thread 2
Second Child Thread 3
Second Child Thread 4
First Child Thread 0
First Child Thread 1
First Child Thread 2
First Child Thread 3
First Child Thread 4
First Child Existed
Second Child Existed */