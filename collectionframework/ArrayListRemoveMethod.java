package collectionframework;

import java.util.ArrayList;

public class ArrayListRemoveMethod {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("null");
        al.add("D");
        System.out.println("Before :"+al);

        al.remove("D");
        System.out.println("after :"+al);

        al.remove(1);
        System.out.println("after === :"+al);

        al.set(2,"+");
        System.out.println("after ++++ :"+al);






    }
}
