package basicprogram.BasicPrgm;

import java.util.Scanner;

public class CalculateArea {


    int calculateAreaTriangle(int base, int height)
    {
        int a = base*height /2;
        return a;
    }

    int calculateAreaRectanle(int length, int weight)
    {
        int a = length*weight ;
        return a;
    }

    int calculateAreaCircle(int side)
    {
        int a = side*side ;
        return a;
    }


    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        CalculateArea obj = new CalculateArea();

        int area= obj.calculateAreaTriangle(2,4);
        System.out.println("Triangle area : "+ area);

        int rectArea = obj.calculateAreaRectanle(4,4);
        System.out.println("Rectangle Area : "+rectArea);

        int circleArea = obj.calculateAreaCircle(4);
        System.out.println("Circle Area : "+circleArea);



    }
}
