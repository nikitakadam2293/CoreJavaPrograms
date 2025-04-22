package java8programming.lambdaexpression;

interface CountWord
{
   int  countWordInInt(String str);
}
public class CountWordInSentence {

    public static void main(String[] args) {

        String str = "jav a ia s";



        CountWord countWord = (s)->{

            if(s==null || s.isEmpty())
            {
                return 0;
            }
            String word[] = str.trim().split("\\s+");
             int len=  word.length;
            System.out.println("Length : " +len);
             return len;
        };

        countWord.countWordInInt(str);
    }
}
