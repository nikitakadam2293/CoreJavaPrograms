package collectionframework;

import java.util.LinkedList;

public class LLAddMethod {

    public static void main(String[] args) {
        LinkedList  names = new LinkedList();

        names.add("john");
        names.add("bob");
        names.add("mark");
        names.add("john");
        //names.add(1);

        System.out.println("Size : " +names.size());

        System.out.println("list : " +names);

        String s= (String) names.get(1);
        System.out.println("Gettind element at index  : "+ s);

        names.set(1,"java");
        System.out.println("list after set method : " +names);



        // remove from index

        names.remove(2);

        System.out.println("After remove at index : "+names);

        names.removeFirst();
        System.out.println("After remove at first : "+names);

        names.removeLast();
        System.out.println("After remove at last : "+names);



    }
}
