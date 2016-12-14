package com.javarush.my;

public class ThisDemo {
    String name;

    ThisDemo(String s) {
        name = s;
        System.out.println(name);
    }

    ThisDemo() {
        this("John");
    }

    public static void main(String args[]) {
        ThisDemo td1 = new ThisDemo("Mary");
        ThisDemo td2 = new ThisDemo();
    }
}
