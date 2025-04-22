package multithreading;

public class MyTread1 {

        public static void main(String[] args) {
            System.out.println("Inside main ");

            Thread tobj = Thread.currentThread();
            System.out.println(tobj.getName());

            System.out.println("info  "+tobj);

            System.out.println("====");

            System.out.println(Thread.currentThread().getName());

        }
    }
/*
Inside main
main
====
main

*/


