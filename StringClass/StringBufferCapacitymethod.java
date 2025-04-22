package StringClass;

public class StringBufferCapacitymethod {

    public static void main(String[] args) {

        StringBuffer obj = new StringBuffer();
        System.out.println(obj.capacity());  // 16 bydefault string buffer capacity is 16

        StringBuffer obj1 = new StringBuffer("java");
        System.out.println(obj1.capacity());  //20


    }
}
