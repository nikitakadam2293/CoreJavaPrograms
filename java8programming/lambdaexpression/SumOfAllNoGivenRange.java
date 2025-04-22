package java8programming.lambdaexpression;

/*
*  Write a Java program to implement a lambda expression to calculate the sum
*  of all prime numbers in a given range.*/


//  ===================================

// This is correct, because prime numbers between 2 and 8 are: 2, 3, 5, 7 → Sum = 17

//  ===================================

import collectionframework.enumeration.EnumerationTest;

import java.util.Scanner;

interface FindSumInGivenRange
{
    int sum(int starting, int ending);
}

public class SumOfAllNoGivenRange {

    public  static boolean isPrime(int num)
    {

        for(int i = 2; i<num ; i++)
        {
            if(num % i ==0)
            {
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Start : ");
        int start = s.nextInt();

        System.out.println("Enter End : ");
        int end = s.nextInt();

        if(end<start)
        {
            System.out.println("Enter valid range");
            return;
        }

          FindSumInGivenRange findSumInGivenRange = (ss,e)->{

            int primeSum =0;
            for(int i = ss; i<=e; i++)
            {
                if (isPrime(i))
                {
                    primeSum = primeSum+i;
                }
            }
            return primeSum;
        };

        int result = findSumInGivenRange.sum(start,end);
        System.out.println("Result : " + result);
    }
}
