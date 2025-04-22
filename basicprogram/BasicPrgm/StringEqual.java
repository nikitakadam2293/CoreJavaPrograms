package basicprogram.BasicPrgm;

public class StringEqual {

    void show()
    {
        String str= "abc";
        String str1= "abcd";
        /*if(str.equals(str1))
        {
            System.out.println(" String are equal.");
        }
        else {
            System.out.println(" String are not equal");
        }*/

        if(str.equals(str1))
        {
            for(int i= 0; i<str.length() ; i++)
            {
                if( str.charAt(i) == str1.charAt(i))
                {
                    System.out.println("String are equal");
                }
            }
        }
        else {
            System.out.println(" String are not equal");
        }

    }

    String s= "java is @1 programming@$# language does 2 ii";


    void stringPrgm()
    {
        char arr[]= s.toCharArray();
        int count=0;
        // count of i in above string
        for( int i =0; i<=arr.length-1 ; i++)

        {
            if( arr[i] == 'i')
            {
                count++;
            }
        }
        System.out.println(" i count is: " + count);
    }
    // find the count of each character

  void display()
    {
        System.out.println("count of each character");
        char arr[] = s.toCharArray();
        boolean b[]=new boolean[s.length()];

        for(int i=0 ; i< arr.length; i++)
        {
            if(b[i])
            {
                continue;
            }
            int count=1;
            //String s= " java is @1 programming@$# language does 2 ii";
            for (int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    b[j]=true;
                }
            }
            System.out.println("Count of " +arr[i] +"is " +count  );

        }

    }
    // find how many character found in String

    void findTotalCharacter()
    {
        System.out.println(" Total char");
        //String s= "java is @1 programming@$# language does 2 ii";

        char arr[] = s.toCharArray();
        int count=0;
        int specialCount=0;
        for( int i = 0; i< s.length();i++ )
        {
            char c=s.charAt(i);

           // if(arr[i] >= 'A' && arr[i] <= 'Z'|| arr[i] >= 'a' && arr[i] <= 'z')


             if(arr[i] >= 'A' && arr[i] <= 'Z'|| arr[i] >= 'a' && arr[i] <= 'z')
            {
                count++;
            }
             else if( !Character.isWhitespace(c) )
             {
                 specialCount++;
             }


          /*  if(c >= 'A'&& c <= 'Z'||c >= 'a'&&c <= 'z')
            {
                count++;
            }*/
        }
        System.out.println(" Total character in this line is " +count );

        System.out.println(" Special character in this line is " +specialCount );

    }



    public static void main(String[] args) {
        StringEqual obj=new StringEqual();
        //obj.show();
        //obj.stringPrgm();
        //obj.display();
        obj.findTotalCharacter();
    }


}
