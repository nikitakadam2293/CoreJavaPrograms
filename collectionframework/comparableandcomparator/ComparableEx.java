package collectionframework.comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ComparableExample implements Comparable<ComparableExample>
{
        String name;
        int age;
        double weight;

    public ComparableExample(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ComparableExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(ComparableExample o) {

        return this.age - o.age;


    }
}
public class ComparableEx {
    public static void main(String[] args) {

        List<ComparableExample> al = new ArrayList<>(Arrays.asList(new ComparableExample("abc",111,100),
                new ComparableExample("def",123,200),
                new ComparableExample("ghi",13,300) ));
/*

        ComparableExample obj1 = new ComparableExample("abc",111,100);
        ComparableExample obj2 = new ComparableExample("def",123,200);
        ComparableExample obj3 = new ComparableExample("ghi",13,300);


        al.add(obj1);
        al.add(obj2);
        al.add(obj3);


 */
        System.out.println("Original AL : " +al);

        Collections.sort(al);
        System.out.println("Afetr Sorting : " + al);



    }

}
