package ExceptionHandeling;

import java.io.IOException;

public class ExceptionScenarioIQue3 {

    public static void main(String[] args) {
      /*  try {
            foo();
        } catch (IOException e) {
            e.printStackTrace();
        }catch(JAXBException e){
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }*/
    }

    public static void foo() throws IOException {

    }

}
/*java: cannot find symbol
  symbol:   class JAXBException
  location: class ExceptionHandeling.ExceptionScenarioIQue3*/

/*indicates that JAXBException is not found in your Java program.

Why is this happening?
JAXBException is part of the Java Architecture for XML Binding (JAXB).
Since Java 11, JAXB has been removed from the default JDK and moved to a separate module (jakarta.xml.bind).
You are trying to catch JAXBException, but your program does not import or include the JAXB API, so the compiler cannot find the class.*/