package ExceptionHandeling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionScenarioIQue1 {

        public static void main(String[] args) {
           /* try {
                multiple();
            } catch (FileNotFoundException | IOException ex) {
                ex.printStackTrace();
            }*/
        }

        public static void multiple() throws IOException, FileNotFoundException{
            System.out.println("Inside multiple");
        }



    }

/*
does not allow subclass-superclass combinations because the superclass already covers the subclass.
* */
