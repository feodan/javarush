package com.javarush.my;

public class Salary2 {
    int value = 1000;

    Salary2() {
    }

    Salary2(Salary2 x) {
        this.value = x.value * 3;
    }

    public static void main(String args[]) {
        Salary2 s1 = new Salary2();
        Salary2 s2 = new Salary2(s1);
        System.out.println("s1.value=" + s1.value);
        System.out.println("s2.value=" + s2.value);
    }
}
