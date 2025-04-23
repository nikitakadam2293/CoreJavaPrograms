package java8programming.lambdaexpression;

public class CreateThreadUsingRunableInLambda {

    public static void main(String[] args) {

        Runnable task = ()->{

            for(int i=0; i<5; i++)
            {
                System.out.println("Running Inside the Thread : "+ i);
            }
        };

        Thread t = new Thread(task);
        t.start();
    }
}
