package StringClass;

public class RegionMatchMethod {
    public static void main(String[] args) {
        String str1 = "java is language of oops";
        String str2 = "language";

        System.out.println(str1.regionMatches(8, str2, 0, 7));// true
    }
}