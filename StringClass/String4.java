package StringClass;

public class String4 {
    public static void main(String[] args) {


        String si = new String(" aa");
        String xsi = new String(" aa");
        System.out.println(si.equals(xsi));



        //===========
        int i = 0;
        String str = "marvellous";
        System.out.println(str);

        System.out.println(str.length());
        /*for (i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));
        }*/
        char arr[]= str.toCharArray();
        for( i= 0; i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }


    }
}
