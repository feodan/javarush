package com.javarush.my;

public class Salary3 {
    int value = 1000;

    Salary3() {
    }

    Salary3(Salary3 x) {
        x.value = x.value * 3;
    }

    public static void main(String args[]) {
        Salary3 s1 = new Salary3();
        System.out.println("First object creation: " + s1.value);

        Salary3 s2 = new Salary3(s1);
        System.out.println("Second object creation: " + s2.value);
        System.out.println("What's happend with first object?:" + s1.value);

        Salary3 s3 = new Salary3(s1);
        System.out.println("Third object creation: " + s3.value);
        System.out.println("What's happend with first object?:" + s1.value);
    }
}
