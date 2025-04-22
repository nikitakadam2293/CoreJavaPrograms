package collectionframework.comparableandcomparator;

import java.util.*;

class PersonEx
{
    String name;
    int age;
    double weight;


    @Override
    public String toString() {
        return "PersonEx{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public PersonEx(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
// Sorting by name
class PersonNameComparator implements Comparator<PersonEx>
{

    @Override
    public int compare(PersonEx o1, PersonEx o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
//Sorting by age

class PersonAgeComparator implements Comparator<PersonEx>
{

    @Override
    public int compare(PersonEx o1, PersonEx o2) {
        return o1.getAge()-o2.getAge();
    }
}

// Sorting by weight
class PersonWeight implements Comparator<PersonEx>
{

    @Override
    public int compare(PersonEx o1, PersonEx o2) {
        return (int) (o1.getWeight() - o2.getWeight());
    }
}

public class ComparatorInterfaceEx {

    public static void main(String[] args) {

        List<PersonEx> l = new ArrayList<>();

        PersonEx obj1 = new PersonEx("ppp",10,303);
        PersonEx obj2 = new PersonEx("zzz",20,403);
        PersonEx obj3 = new PersonEx("abc",30,93);
        PersonEx obj4 = new PersonEx("jkl",40,703);

        l.add(obj1);
        l.add(obj2);
        l.add(obj3);
        l.add(obj4);

        System.out.println("Original ArrayList : " +l);

        PersonNameComparator personNameComparator = new PersonNameComparator();
        Collections.sort(l,personNameComparator);

        System.out.println("After Sorting  by Name : " +l);
        System.out.println("====================");

        PersonAgeComparator personAgeComparator = new PersonAgeComparator();
        Collections.sort(l,personAgeComparator);
        System.out.println("Afetr Sorting by age : " + l);

        System.out.println("====================");

        PersonWeight  personWeight = new PersonWeight();
        Collections.sort(l,personWeight);
        System.out.println("Afetr Sorting by weight : " + l);

    }
}
