package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        GenericDemo o= new GenericDemo();

        List list= new ArrayList<>();   //heterogenous

        list.add(o);
        list.add(100);
        list.add("java");
        list.add(true);

        for(Object obj:list){

            if(obj instanceof String)
            {
                String s= (String) obj;
                System.out.println(s);
            }

            if(obj instanceof Integer)
            {
                Integer i = (Integer) obj;
                System.out.println(i);
            }

            /// ///////
            if(obj instanceof Object)
            {
                Object io = (Object) obj;
                System.out.println("obj id "+io);
            }

/*
            Integer i= (Integer) obj;  //type casting => downcasting
            System.out.println(i);
*/


//            System.out.println(obj);
        }
    }
}
