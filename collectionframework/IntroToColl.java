package collectionframework;

//not work properly
public class IntroToColl {
    public static void main(String[] args) {
        Integer[] arr={90,80,90,70,70,70,70};

        System.out.println("Enter Remove index ");
        int ind=1;

        System.out.println("before");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }

       // arr[1]=null;
        for(int i=ind;i< arr.length;i++)
        {
            arr[i]=arr[i+1];

        }
        arr[arr.length-1] =null;

          System.out.println("After");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
