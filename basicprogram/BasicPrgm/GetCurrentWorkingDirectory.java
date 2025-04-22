package basicprogram.BasicPrgm;

public class GetCurrentWorkingDirectory {

    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        System.out.println("Current Directory : "+ dir);

        System.out.println("Java Version       : " + System.getProperty("java.version"));
        System.out.println("OS Name            : " + System.getProperty("os.name"));
        System.out.println("User Home Directory: " + System.getProperty("user.home"));
    }
}
/*
* Current Directory : C:\Users\Admin\Desktop\Java Program\java programming\java programming
Java Version       : 21.0.6
OS Name            : Windows 11
User Home Directory: C:\Users\Admin
* */