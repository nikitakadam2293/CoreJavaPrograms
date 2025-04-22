package basicprogram.BasicPrgm;

import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First No");  //4
        int a = sobj.nextInt();

        System.out.println("Enter Second No");  //8
        int b = sobj.nextInt();

        int hieghestCommonFactor =1;
        for(int i=1; i<=a && i<=b ; i++)
        {
            if((a%i == 0 )&& (b% i ==0))
            {
                 hieghestCommonFactor = i;
            }
        }
        System.out.println("Heighest Common factor : "+  hieghestCommonFactor);

    }
}

/*
*  int c;
        if(a<b)   //4<8
        {
             c = a;  //c=4
        }
        else
        {
            c=b;
        }
        int highestCommonFactor =1;
        for(int i=1; i<= c; i++)  // i=1; i<4; i++
        {
            if((a% i) == (b% i) )
            {
                 highestCommonFactor = i;
            }

        }
        System.out.println("Heighest Common Fact : "+highestCommonFactor);
*/