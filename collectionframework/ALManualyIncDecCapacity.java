package collectionframework;

import java.util.ArrayList;

public class ALManualyIncDecCapacity {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Fr : " + list.size());
        list.ensureCapacity(20);
        System.out.println("Sec : " + list.size());
        list.trimToSize();

    }
}