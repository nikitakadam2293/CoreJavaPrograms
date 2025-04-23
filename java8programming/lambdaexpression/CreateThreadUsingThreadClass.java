package java8programming.lambdaexpression;

public class CreateThreadUsingThreadClass {

    public static void main(String[] args) {

        Thread t = new Thread(()->{
            for(int i=0; i<5; i++)
            {
                System.out.println("Running Thread : " + i);
            }
        });

        t.start();

    }
}
