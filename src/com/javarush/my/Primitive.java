package com.javarush.my;

public class Primitive {
    Primitive(double d) {
        d = d + 10;
        System.out.println("d=" + d);
    }

    public static void main(String args[]) {
        int i = 20;
        Primitive s1 = new Primitive(i);
    }
}
