package basicprogram;

import java.util.Arrays;

public class AnagramString {


    boolean isAnagram()
    {
        String str1= "Hell";
        String str2= "ellh";

        if(str1.length()!= str2.length())
        {
            return false;

        }
        String s1= str1.toLowerCase();
        String s2 = str2.toLowerCase();

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

       return   Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {

        AnagramString obj = new AnagramString();
        if(obj.isAnagram())
        {
            System.out.println("String is anagam");
        }
        else
        {
            System.out.println("String is not  anagam");

        }

    }
}
