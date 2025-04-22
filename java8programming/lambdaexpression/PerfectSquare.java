package java8programming.lambdaexpression;

interface PerfectSq
{
    boolean checkPerfectSuare(int no);
}
public class PerfectSquare {

    public static void main(String[] args) {

        PerfectSq perfectSq = (n)->{

            if(n<0) return false;

            int sqr = (int) Math.sqrt(n);

            return sqr*sqr == n;
    };

        int no1 = 25;
        int no2 = 11;

        System.out.println(no1 +" is perfect square? : " +   perfectSq.checkPerfectSuare(no1));
        System.out.println(no2 +" is perfect square? : " +   perfectSq.checkPerfectSuare(no2));

    }
}
