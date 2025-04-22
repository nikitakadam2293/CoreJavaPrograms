package collectionframework.arraylistiteratingway;

import java.util.ArrayList;

//Iterate ArrayList in Java using for loop

public class UsingForLoop {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        int size = al.size();
        System.out.println("Size is : " +size);

        /*for(int i=0; i<size; i++)
        {
            System.out.println(i);
        }*/

        for(int i=0; i<al.size(); i++)
        {
            System.out.println(i);
        }
    }
}

/*

Size is : 4
0
1
2
3

*/