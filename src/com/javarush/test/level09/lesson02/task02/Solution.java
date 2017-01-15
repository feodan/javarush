package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[3].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[4].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[5].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println();

        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
        System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[3].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[4].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[5].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[6].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println();

        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
