package collectionframework.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableMethod {
    public static void main(String[] args) {

        Hashtable<Integer,String>  ht = new Hashtable<>();

        System.out.println("Empty ? " + ht.isEmpty());

        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Three");
        ht.put(4, "Four");
        ht.put(5, "Five");
        ht.put(6, "Six");

        System.out.println("HashTable : " + ht);

        System.out.println("Size  is : " + ht.size());  //6

        System.out.println(ht.remove(6));  //Six

        System.out.println("Getting : " + ht.get(4));   //  Getting : Four

        System.out.println("Replace : " + ht.replace(3,"Thhhhhhhhree"));

        System.out.println("HashTable : " + ht);

        System.out.println("Contains Key : " + ht.containsKey(6));  //false
        System.out.println("Contains Key : " + ht.containsValue("Thhhhhhhhree"));  //true

        System.out.println("++++++++++++++++++++++++++++++++++");

        System.out.println("Iterating HashTable");

        Iterator <Map.Entry<Integer,String>> itr = ht.entrySet().iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("Iterating Using Key : ");

        Iterator<Integer> i = ht.keySet().iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println("*********************");

        System.out.println("Iterating using value ");
        Iterator<String> s= ht.values().iterator();

        while (s.hasNext())
        {
            System.out.println(s.next());
        }
    }}
