package collectionframework.linkedlistprogram;

import java.util.LinkedList;

public class AddToLL {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        for(int i=0 ; i<=10; i++)
        {
            if(i%2 ==0)
            {
                ll.add(i);
            }
        }
        System.out.println("LL : " + ll);
        System.out.println("Get First ELe : " +ll.getFirst());
        System.out.println("Get Last ELe : " +ll.getLast());

        System.out.println("Get ELe at index: " +ll.get(1));

    }
}
