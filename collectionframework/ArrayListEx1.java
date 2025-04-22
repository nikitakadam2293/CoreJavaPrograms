package collectionframework;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {

        ArrayList al =new ArrayList();
        al.add("A");
        al.add("B");
        al.add(20);
        al.add("A");
        al.add(null);
        System.out.println(al);

        ArrayList al2 =new ArrayList();
        al2.add("a");
        al2.add("b");
        al2.add("c");


        System.out.println(al.addAll(al2));
        System.out.println("After "+al);


        System.out.println(al.addAll(2,al2));
        System.out.println("After ===="+al);


    }
}
