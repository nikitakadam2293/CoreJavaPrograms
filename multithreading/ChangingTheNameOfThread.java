package multithreading;

public class ChangingTheNameOfThread {
    public static void main(String[] args) {

         Thread tobj = Thread.currentThread();
        System.out.println("current thread "+ tobj);

        System.out.println("Name of current thread " + tobj.getName());

        tobj.setName("New Thread");

        System.out.println("Name of thread after changing :  "+ tobj);


    }
}
