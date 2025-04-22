package collectionframework.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String[] args) {

        String str = "He is a gental man ";
        String delimeter = " ,"; // space and comma

        StringTokenizer st = new StringTokenizer(str,delimeter);

       int count = st.countTokens();
        System.out.println("Count is : " + count);

        System.out.println("Token are : ");

        while (st.hasMoreTokens())
        {
            String tokens = st.nextToken();
            System.out.println(tokens);

        }
    }
}
