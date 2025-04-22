package ExceptionHandeling;

import java.util.Scanner;

public class MultipleCatchScenario3 {

    public static void main(String[] args) {
        int x,y;
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter first no");
            //x=sobj.nextInt();
             x= Integer.parseInt(sobj.nextLine());

            System.out.println("Enter Second no");
            // y=sobj.nextInt();

             y= Integer.parseInt(sobj.nextLine());

            int z= x/y;
            System.out.println("z : " + z);
        }

        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException occure");
             //e.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occure");
        }

    }
}
/*
System.out.println("Enter first no");
x=sobj.nextInt();

System.out.println("Enter Second no");
y= Integer.parseInt(sobj.nextLine());

above combination give NumberFormatException exception

* */

/*
System.out.println("Enter first no");
x=sobj.nextInt();

System.out.println("Enter Second no");
y=sobj.nextInt();

output :
Enter first no
8
Enter Second no
1.1
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:943)
	at java.base/java.util.Scanner.next(Scanner.java:1598)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2263)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2217)
	at ExceptionHandeling.MultipleCatchScenario3.main(MultipleCatchScenario3.java:18)

* */