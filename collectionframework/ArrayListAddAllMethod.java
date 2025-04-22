package collectionframework;

import java.util.ArrayList;

public class ArrayListAddAllMethod {
    public static void main(String[] args) {

        ArrayList al1 =new ArrayList();

        al1.add(11);
        al1.add(22);
        al1.add(null);
        al1.add("A");

        System.out.println("al1 : "+al1);

        ArrayList al2 =new ArrayList();

        al2.add(33);
        al2.add("B");
        al2.add(null);
        al2.add(null);
        al2.add(44);

        System.out.println("al2 : "+al2);

        al1.addAll(al2);
        System.out.println(al1);



    }
}
