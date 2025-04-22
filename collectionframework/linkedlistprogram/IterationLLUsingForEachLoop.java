package collectionframework.linkedlistprogram;

import java.awt.*;
import java.util.LinkedList;

public class IterationLLUsingForEachLoop {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("White");

        System.out.println("Using ForEach / Advance Loop : ");

        for(String str : list)
        {
            System.out.println(str);
        }

    }
}
