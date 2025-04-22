package collectionframework.arraylistiteratingway;

import java.util.ArrayList;

public class UsingEnhanceForLoop {
    public static void main(String[] args) {

        ArrayList<String> al =new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        System.out.println("Array List is : " + al);

        System.out.println("For Loop : ");
        for(int i=0; i<al.size(); i++)
        {
            String getElement = al.get(i);
            System.out.println(getElement);
        }
        System.out.println("=====================================");

        System.out.println("Using enhance for loop");

        for (String element : al)
        {
            System.out.println(element);
        }


    }
}
