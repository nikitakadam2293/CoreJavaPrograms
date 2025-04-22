package intervievquestion;

import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        int a = 10;
        int b = 20;

        // and operator

        if(a>=10 && b <= 20)
        {
            System.out.println("true");
        }

        // or

        if(a>=10 || b <= 10)
        {
            System.out.println("Hello");
        }

        ///  ternary operator

        int ans ;

        ans= a<b ? a:b ;
        System.out.println(ans);  //10

        //
        System.out.println("Arithmetic Operator : ");

        int c = a+b;   // Arithmetic Operator
        System.out.println("Addition  :" + c);

        int d = a+b;   // substraction Operator
        System.out.println("substraction  :" + d);

        int e = a*b;   // multiplication Operator
        System.out.println("multiplication  :" + e);

        int f = a/b;   // division Operator
        System.out.println("division  :" + f);

        int g = a%b;   // modulus Operator
        System.out.println("modulus  :" + g);


        System.out.println("Relational Operator : ");

        System.out.println(" == operator   : ");
        if(a==b)
        {
            System.out.println("a == b");
        }
        else
        {
            System.out.println("a is not equal to b ");
        }

        System.out.println(" != operator ");
        if(a!=b)
        {
            System.out.println("a is not equal to b");
        }
        else
        {
            System.out.println("a is equal to b");
        }

        System.out.println("Greater than operator");
        if(a>b)
        {
            System.out.println("a is greater than   b");
        }
        else
        {
            System.out.println("a is not  greater than   b");
        }


        System.out.println("Less than operator");
        if(a<b)
        {
            System.out.println("a is less than   b");
        }
        else
        {
            System.out.println("a is   greater than   b");
        }

        System.out.println("greater than or equal to operator");
        if(a>=b)
        {
            System.out.println("a is greater than or equal to b");
        }
        else
        {
            System.out.println("a is not   greater than or equal   b");
        }


        System.out.println("less than or equal to operator");
        if(a<=b)
        {
            System.out.println("a is less than  or equal to  b");
        }
        else
        {
            System.out.println("a is  not less than to   b");
        }

        System.out.println();
        System.out.println("Instance of Operator : ");

        ConditionalOperator obj = new ConditionalOperator();

        System.out.println(obj instanceof ConditionalOperator);  //true

        System.out.println("Bitwise Operator : ");

        System.out.println("a & b : " + (a&b));  //0

        System.out.println(" a | b : " + (a|b));  // 30
        System.out.println("a ^ b : " + (a ^ b));   // 30

        System.out.println(" ~ a : " + (~a));  // -11

        System.out.println(" a<< 1 : " + (a<<1)); // 20

        System.out.println("a >> 1 : " + (a>> 1));  //5

        System.out.println();
        System.out.println("new operator : ");

        ConditionalOperator obj1 = new ConditionalOperator();

        int arr[] = new int[4];

        System.out.println("======= Array subscript operator or Array Access Operator =======");

        for(int i =0 ; i< arr.length;i++)
        {
            arr[i] = sobj.nextInt();
        }
        for(int i =0; i< arr.length ;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Short Circuit Operator : ");

        if(a>= 10 && b <= 20)
        {
            System.out.println("&& Short Circuit Operator");
        }
        if(a>=10 || b <=15)
        {
            System.out.println("||  Short Circuit Operator");
        }

        System.out.println("==========================================");

        System.out.println("Casting Program");

        byte k =10;
        short s= k;
        System.out.println("byte to short : "+ s);  //10

        int i1 = s;
        System.out.println("short to int : " + i1);  //10

        long l1= i1;
        System.out.println("int to long : " + l1);   //  10

        float f1 = l1;
        System.out.println("long to  Float " + f1);   // 10.0

        double d1 = f1;
        System.out.println("Float to double : " + d1);  // 10.0

        System.out.println("");
        System.out.println("==========================================");

        System.out.println("Downcasting : : ");

        double d11 = 22.11;

        float f11 = (float) d11;
        System.out.println("Double to float : " + f11);  // 22.11

        long l11 = (long) f11;
        System.out.println("float to long  " + l11);  // 22

        int i11 =(int) l11;
        System.out.println("long to int " + i11);   // 22

        short s11 = (short) i11;

        System.out.println("int to short : " + s11);   // 22

        byte b11 = (byte) s11;
        System.out.println("short to byte : " + b11);  // 22

        boolean boolean11 =( b11 !=0);
        System.out.println("boolean : " +boolean11);  //  true








    }
 }