package com.javarush.my;

public class DefaultDemo {
    DefaultDemo(String s) {
        System.out.print("DefaultDemo(String)");
    }

    DefaultDemo(int... v) {
        System.out.println("DefaultDemo(int ...)");
    }

    public static void main(String args[]) {
        DefaultDemo dd = new DefaultDemo();
    }
}
