package java8programming.lambdaexpression;

interface Concate
{
    String concateTwoStr(String s1, String s2);

}

public class ConcateTwoString {
    public static void main(String[] args) {

        String s11="java";
        String s22 ="Program";

        Concate concate =(s1,s2)->{

            String s3= s1+s2;

            return s3;
        };

         String s= concate.concateTwoStr(s11,s22);
        System.out.println(s);

    }
}
