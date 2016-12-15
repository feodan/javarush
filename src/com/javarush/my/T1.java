package com.javarush.my;

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.io.IOException;

public class T1 {
//    public static double getDistance(int x1, int y1, int x2, int y2) {
//        int i = ((x2 - x1) *(x2 - x1)) + ((y2 - y1) *(y2 - y1));
//        return Math.sqrt(i);
//    }

    public static void main(String[] args) {
//        System.out.println(getDistance(2, 4, 8, 1));
        System.out.println(StringHelper.multiply("Anton"));
        System.out.println(StringHelper.multiply("Anton", 3));
    }
}
