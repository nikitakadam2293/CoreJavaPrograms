package basicprogram.BasicPrgm;

public class Count_Character_SpecialChar_Number {
    public static void main(String[] args) {

        String s = "Java Program123$ test@gmail.com";

        char arr[] = s.toCharArray();
        // count character

        int countChar =0;
        int countSpecial =0;
        int countNum = 0;
        int countWhiteSpace =0;
        
        for(int i =0; i<arr.length; i++)
        {
            if((arr[i] >= 'a' && arr[i] <='z' ) || (arr[i] >= 'A' && arr[i]<= 'Z'))
            {
                countChar++;
            }
            else if (!Character.isLetterOrDigit(arr[i])  && !Character.isWhitespace(arr[i])  )
            {
                countSpecial++ ;
            }
            else if(arr[i] >='0' && arr[i] <= '9')  // isDigit(arr[i]) also use
            {
                countNum++ ;
            } else if (Character.isWhitespace(arr[i]))   //(arr[i] == ' ')
            {

                countWhiteSpace++;
            }
            else
            {

            }

        }
        System.out.println("Character Count : " + countChar);
        System.out.println("Special Character Count : " +countSpecial);
        System.out.println("Total Digit : " + countNum);
        System.out.println("Count white space : " + countWhiteSpace);
        System.out.println("Total Lenght : " + arr.length);
    }
}

/*
*
Character Count : 23
Special Character Count : 3
Total Digit : 3
Count white space : 2
Total Lenght : 31

* */