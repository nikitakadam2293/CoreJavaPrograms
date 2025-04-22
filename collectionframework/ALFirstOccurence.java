package collectionframework;

import java.util.ArrayList;

public class ALFirstOccurence {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("ABC");
        al.add("DEF");
        al.add("ABC");
        al.add("GHI");
        al.add(null); // null element is allowed in the ArrayList.
        System.out.println("Original ArrayList order:" +al);

        Integer index = al.indexOf("ABC");
        System.out.println("Index of ABC : " + index);  //0

        Integer indexOfNull = al.indexOf(null);
        System.out.println("Index of null : " + indexOfNull);  //4

        Integer indexOfNotFoundEle = al.indexOf("JPQ");
        System.out.println("Index of not found element  : " + indexOfNotFoundEle);  //-1

        Integer lastIndexOf = al.lastIndexOf("ABC");
        System.out.println("Last index : " + lastIndexOf);

    }
}
