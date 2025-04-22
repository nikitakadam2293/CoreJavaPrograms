package objectclassmethod;

class  Demo2
{

}
public class GetClassMethod {
    public static void main(String[] args) {
        Demo obj = new Demo();
        Class ref = obj.getClass();
        System.out.println("Class name of obj is : "+ ref ); //Class name of obj is : class objectclassmethod.Demo

        /// /////////
        GetClassMethod o = new GetClassMethod();
        Class oref = o.getClass();
        System.out.println(" Name of GetClassMethod is : "+ oref.getName());  // Name of GetClassMethod is : objectclassmethod.GetClassMethod



        ///  /////////
        String str = "Hello";
        Class cref = str.getClass();
        System.out.println("class name of str is : "+ cref.getName()); //class name of str is : java.lang.String

        Integer i =10;
        Class ierf = i.getClass();
        System.out.println("Integer class name is : "+ ierf.getName()); //Integer class name is : java.lang.Integer

    }
}
