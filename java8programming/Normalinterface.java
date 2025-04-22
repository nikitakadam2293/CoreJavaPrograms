package java8programming;

public interface Normalinterface
{

    void test();
    void show();
    void  tttt();
}

@FunctionalInterface
 interface FunctinalInterface
{
    void test();
  static  void show()
  {
      System.out.println("Static Method");
  }
  default void test1()
  {
      System.out.println("Test method ");
  }

}
