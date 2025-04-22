package java8programming.lambdaexpression;

import java.util.Arrays;
import java.util.List;

interface  CheckString
{
    void checkListOfString(List<String> list);
}
public class CheckListOfStringInUpperOrLowerCase {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ab", "AA","aa");

        CheckString  checkString =(l)->{

            for(int i=0; i<list.size();i++)
            {
                String str= list.get(i);
                if(str.equals(str.toUpperCase()))
                {
                    System.out.println(  str +"  String is uppercase");
                }
                else if (str.equals(str.toLowerCase()))
                {
                    System.out.println(str+ " String is lowercase");
                }
                else
                {
                    System.out.println(str + "  String is mixed case");
                }
            }

        };
        checkString.checkListOfString(list);
    }
}
