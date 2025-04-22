package Static;

public class StackOverFlowTest {

    void t1(){
        // t2();
    }

    void t2(){
        // t1();
    }

    public static void main(String[] args) {
        StackOverFlowTest obj = new StackOverFlowTest();    //

        //       Reference_Type      =  Actual-Object  //Object_Type
        //   Stack   = Heap
        obj.t1();
    }
}
