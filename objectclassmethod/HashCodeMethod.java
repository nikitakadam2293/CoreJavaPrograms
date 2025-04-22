package objectclassmethod;

class Demo{

}
public class HashCodeMethod {
    public static void main(String[] args) {
        String str1 ="Hello";
        String str2 ="Hello";
        String str3 ="Hi";
        Demo obj = new Demo();

        System.out.println("HashCode of str1 : " + str1.hashCode());
        System.out.println("HashCode of str2 : " + str2.hashCode());
        System.out.println("HashCode of str3 : " + str3.hashCode());
        System.out.println("HashCode of obj : " + obj.hashCode());

    }
}
