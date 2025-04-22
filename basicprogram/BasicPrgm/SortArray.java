package basicprogram.BasicPrgm;

public class SortArray {
    int arr[]= { 11,22,44,23,44};

    void show() {
        for (int i = 0; i < arr.length; i++) {
            for (int j= i+1; j< arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                        //int temp= arr;
                }
            }

        }
      //  System.out.println(arr[]);
    }

    public static void main(String[] args) {
        SortArray o= new SortArray();
        o.show();
    }

}
