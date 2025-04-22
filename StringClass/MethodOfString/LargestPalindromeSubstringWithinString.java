package StringClass.MethodOfString;

import java.util.Scanner;

class Palindrome {
     boolean checkPalindrom(String str, int low, int high) {
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;
            }

            low++;
            high--;
        }
        return true;
    }

     String longestpalindrome(String str) {

        int strart = 0;
        int maxlen = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (checkPalindrom(str, i, j) && (j - i+1) > maxlen) {
                    strart = i;
                    maxlen = j+1;
                    //maxlen = j - i + 1;
                }
            }
        }
        return str.substring(strart,  maxlen); //strart+ maxlen
    }
}
public class LargestPalindromeSubstringWithinString {
    public static void main(String[] args) {

        //String str="forgeeksskeegfor";

        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter String ");
        String str= sobj.nextLine();

        Palindrome obj = new Palindrome();

        System.out.println(obj.longestpalindrome( str));
    }
}
