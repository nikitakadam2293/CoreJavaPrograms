package StringClass;

public class StringScenario {
    public static void main(String[] args) {
        String s="java";  //scp
        String s1=s.concat("python");   //heap
        System.out.println(s);  //heap

        System.out.println(s==s1);  //false
    }
}
