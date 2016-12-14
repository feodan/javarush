package com.javarush.my;

public class Checking {
    public Checking(String s, int... n) {
        if (n.length > 1) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Checking checking = new Checking("AA5510ME", 12);
    }
}
