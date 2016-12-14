package com.javarush.my;

public class ReturnDemo {
    /**
     * В конструкторе допускается использование оператора
     * return без параметров.
     */
    public ReturnDemo() {
        System.out.println("Constructor");
        return;
    }

    public static void main(String s[]) {
        ReturnDemo r = new ReturnDemo();
    }
}
