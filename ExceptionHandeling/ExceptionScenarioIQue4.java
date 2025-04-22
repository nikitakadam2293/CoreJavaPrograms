package ExceptionHandeling;

public class ExceptionScenarioIQue4 {

    public static void main(String[] args) {
        try{
            bar();
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        foo();

    }

    public static void bar(){

    }

    public static void foo() throws NullPointerException{

    }

}
/*
*
*
* This is a trick question, there is no problem with the code and it will compile successfully.
*  We can always catch an Exception or any unchecked exception even if it’s not in the throws
* clause of the method.

Similarly, if a method (foo) declares the unchecked exception in the throws clause,
* it is not mandatory to handle that in the program.


* */