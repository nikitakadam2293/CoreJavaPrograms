package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static  void main(String[] args) {
        Integer [] arr={100,60,90,80,30,70};
         arr[3] =null;  //element GC eligible =remove the element from array

        List<String>  stringList=new ArrayList<>();
        stringList.add("test"); //element index 0
        stringList.add("test1"); //element index 1
        stringList.add("test2");  //element index 2

        System.out.println(stringList.size());  //0


        Integer newArray[] = new Integer[10];
        newArray[0]=100;
        newArray[1]=200;




    }
}
