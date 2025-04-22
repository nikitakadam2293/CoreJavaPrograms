package java8programming.lambdaexpression;

import java.util.Arrays;
import java.util.List;

interface FindSecondSmallestAndLargest
{
    int findNumber(int arr[]);
}

interface FindSecondSmallest
{
    int findSecondSmallest(int arr[]);
}

public class FindSecondLargestAndSecondSmallestUsingLambda {

    public static void main(String[] args) {

      int a[] = {32, 8,7,4,55,33,77,9,44,90,88,9,89,5 };

      FindSecondSmallestAndLargest findSecondSmallestAndLargest = (l)->{

            int largest = a[0];
            int secondLargest = a[0];


            for (int i=1; i<a.length ; i++)
            {
                if(a[i] > largest)
                {
                    secondLargest  = largest;
                  largest = a[i];
                }
                else if(a[i] > secondLargest && a[i] != largest)
                {
                    secondLargest = a[i];
                }
            }

            return secondLargest;
        };
        FindSecondSmallest findSecondSmallestNo =(m)->{

            int smallest = a[0];
            int secondSmallest = a[1];

            for(int i= 1; i<a.length; i++)
            {
                if(a[i] < smallest)
                {
                    secondSmallest = smallest;
                    smallest = a[i];
                }
                else if (a[i] < secondSmallest && a[i]  != smallest) {
                    secondSmallest = a[i];

                }
            }

            return secondSmallest;
        };

         int resLargest  = findSecondSmallestAndLargest.findNumber( a);
        System.out.println("Second Largest : " +resLargest);

        int resSmallest = findSecondSmallestNo.findSecondSmallest(a);
        System.out.println("Second Smallest : " + resSmallest);

    }
}


