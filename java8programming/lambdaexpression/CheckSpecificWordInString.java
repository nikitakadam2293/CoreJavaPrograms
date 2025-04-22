package java8programming.lambdaexpression;

import java.util.Arrays;
import java.util.List;

interface CheckSpecificWord
{
    boolean checkWord(List<String> list,String word);
}

public class CheckSpecificWordInString {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple","banana","pineapple","mango");

        CheckSpecificWord  checkSpecificWord = (l,w)->{
           boolean check =   l.contains(w);
            return  check;
        };

        String checkWord ="pineapple";

         boolean result = checkSpecificWord.checkWord(list,checkWord);

         if(result)
         {
             System.out.println("Word Present ");
         }
         else
         {
             System.out.println("Word is not present");
         }



    }
}
