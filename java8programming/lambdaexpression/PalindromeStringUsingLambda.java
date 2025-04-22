package java8programming.lambdaexpression;

interface Palindrome
{
    void isPalindrom(String s);
}

public class PalindromeStringUsingLambda {

    public static void main(String[] args) {

        String  str = "nayanq";

        Palindrome palindrome = (s)->
        {
            String rev = "";

            for(int i = str.length()-1; i>=0; i--)
            {
                rev= rev + str.charAt(i);
            }

            if(str.equals(rev))
            {
                System.out.println("String is palindrom");
            }
            else
            {
                System.out.println("String is not  palindrom");
            }
        };

        palindrome.isPalindrom(str);


    }
}
