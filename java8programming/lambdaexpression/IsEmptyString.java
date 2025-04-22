package java8programming.lambdaexpression;

interface EmptyString
{
    boolean checkEmptyString(String str);
}
public class IsEmptyString {

    public static void main(String[] args) {

        String str1 = "java";
        EmptyString emptyString = str -> str.isEmpty();

        String s1 ="";
        String s2= "java";

        System.out.println(emptyString.checkEmptyString(s1));   //  true

        System.out.println(emptyString.checkEmptyString(s2));    //  false



    }
}
