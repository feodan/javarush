package com.javarush.my;

public class Initialization {
    int i;
    short z = 10;
    static int x;
    static double y;

    static {
        x = 2000;
        y = 3.141;
    }

    Initialization() {
        System.out.println("i=" + i);
        System.out.println("z=" + z);
        z = 20;
        System.out.println("z=" + z);
    }
}
