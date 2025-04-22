package collectionframework.stringtokenizer;

public class StringTokenizerUsingSplitMethod {
    public static void main(String[] args) {

        String str= " He,lllo java is a pr,ogramming lang,uage";

        String delimeter ="[ ,]";
        String arr[] = str.split(delimeter);

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
