package basicprogram.BasicPrgm;

public class CountNoNew {
    public static void main(String[] args) {
        int a=1244;
        int temp=a;
        int count=0;
        while(a!=0){
            temp=a/10;
            count=count+1;
            a=a/10;
        }
        System.out.println(count);
    }
}
