package ExceptionHandeling.compiletimeex;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundEx {
    public static void main(String[] args) {

        File obj = new File("abc.txt");
       // FileReader fr = new FileReader(obj);

    }
}
/*
* java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown*/