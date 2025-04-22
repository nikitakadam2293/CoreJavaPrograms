package java8programming;

@FunctionalInterface
interface  LambdaEx
{
    void demo();
}


public class FunctinalInterfaceEx {

    public static void main(String[] args) {

        LambdaEx a =()->
            System.out.println("Lambda Ex");

        a.demo();

    }

}
