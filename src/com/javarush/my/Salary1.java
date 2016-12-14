package com.javarush.my;

public class Salary1 {
    Salary1(int x) {
        x = x * 3;
        System.out.println("x=" + x);
    }

    public static void main(String args[]) {
        int value = 1000;
        Salary1 s1 = new Salary1(value);
        System.out.println("value=" + value);
    }
}
