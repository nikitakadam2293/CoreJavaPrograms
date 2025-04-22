package collectionframework;

import java.util.ArrayList;

public class ALGetSizeContain {
    public static void main(String[] args) {

        ArrayList al= new ArrayList();

        al.add("Apple");
        al.add("Orange");
        al.add("Banana");
        al.add("Gauva");

        System.out.println(al);

        //String fname=al.get(2);
        System.out.println(al.get(2));

        int n= al.size();
        System.out.println("Size : " +n);

        boolean check=al.contains("App");
        System.out.println(check);  //false

        int pos= al.indexOf("Apple");

        System.out.println("index of " +pos);

        int lastPos =al.lastIndexOf("Banana");
        System.out.println("last index of " +lastPos);

        /// ////////
    }
}
