package ExceptionHandeling;

public class ClassNotFoundException1 {

        public static void main(String[] args)
        {
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            }catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
    }

/*
java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:421)
	at java.base/java.lang.Class.forName(Class.java:412)
	at ExceptionHandeling.ClassNotFoundException1.main(ClassNotFoundException1.java:9)

**/