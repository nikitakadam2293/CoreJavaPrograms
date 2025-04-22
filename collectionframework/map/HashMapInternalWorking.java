package collectionframework.map;

import java.util.HashMap;

public class HashMapInternalWorking {

   /* @Override
    public int hashCode()
    {
        return 1001;
    }*/
    public static void main(String[] args) {

        String s= new String("java");

        HashMapInternalWorking  obj = new HashMapInternalWorking();
        int hash = obj.hashCode();
        System.out.println("Value of hash is : " +hash);

        HashMapInternalWorking  obj1 = new HashMapInternalWorking();
        int hash1 = obj1.hashCode();
        System.out.println("Value of hash1 is : " +hash1);

        HashMapInternalWorking  obj3 = new HashMapInternalWorking();



        // Hashing is nothing but the function or algorithm or method which when applied on any
        //object/variable returns a unique integer value representing that object/variable
        //This unique integer value is called hashcode.

        HashMap<HashMapInternalWorking, String> map = new HashMap<>();

        map.put(obj,"Test");
        map.put(obj1,"Test2");
        System.out.println( "when " +  map.get(obj3));  //null

    }
}
