package basicprogram.BasicPrgm;

import java.util.Scanner;

public class GetAllDigitFromString {

    Scanner sobj = new Scanner(System.in);

    String digitCount() {
        System.out.println("Enter  String : ");
        String str1 = sobj.nextLine();  //java1234

        int length = str1.length();

        StringBuffer stringBuffer = new StringBuffer(length);

        for (int i = 0; i < length; i++) {
            char ch = str1.charAt(i);

            if (Character.isDigit(ch)) {
                stringBuffer.append(ch);
            }
        }
        return  stringBuffer.toString();



    }
    public static void main(String[] args) {

        GetAllDigitFromString obj = new GetAllDigitFromString();
        System.out.println(obj.digitCount());



    }
}
