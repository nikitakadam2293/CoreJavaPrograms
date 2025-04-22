package multithreading;

//creating multiple thread to perform multiple task
class MyThread11 extends Thread
{
    String task;

    MyThread11(String task)
    {
        this.task = task;
    }

    public void run()
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println(task + " " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

}
public class MultipleThreadPerformingMultipleTask {
    public static void main(String[] args) {

        /*Create two thread objects to represent two tasks.
       // Passing task as an argument to its constructor.*/
        MyThread11 t1 = new MyThread11("Check the picture ticket ");
        MyThread11 t2 = new MyThread11("Show seat number  ");

        //Create two objects of Thread class and pass two objects as parameter to constructor of Thread class.

        Thread  one = new Thread(t1);
        Thread  two = new Thread(t2);

        one.start();
        two.start();


    }
}
/*
Check the picture ticket  0
Show seat number   0
Check the picture ticket  1
Show seat number   1
Show seat number   2
Check the picture ticket  2
Check the picture ticket  3
Show seat number   3
Show seat number   4
Check the picture ticket  4

*
* */


/*
* if we comment sleep method it gives below output

Show seat number   0
Show seat number   1
Show seat number   2
Show seat number   3
Show seat number   4
Check the picture ticket  0
Check the picture ticket  1
Check the picture ticket  2
Check the picture ticket  3
Check the picture ticket  4
*/