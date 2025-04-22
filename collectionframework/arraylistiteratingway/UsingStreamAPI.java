package collectionframework.arraylistiteratingway;

import java.util.ArrayList;

public class UsingStreamAPI {
    public static void main(String[] args) {

        ArrayList al =new ArrayList();

        al.add("Element1");
        al.add("Element2");
        al.add("Element3");
        al.add("Element4");

        al.stream().forEach(System.out::println);
    }
}
