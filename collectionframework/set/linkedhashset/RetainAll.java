package collectionframework.set.linkedhashset;

import java.util.LinkedHashSet;

public class RetainAll {

    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("D");

        System.out.println("Before retainAll:");
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);

        set1.retainAll(set2); // keeps only common elements in set1

        System.out.println("\nAfter retainAll:");
        System.out.println("set1 = " + set1); // Output: [B, C]
    }

}
