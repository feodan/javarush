package com.javarush.test.level08.lesson11.home07;

/* Переставь один модификатор static
Переставь один модификатор static, чтобы пример скомпилировался.
*/

public class Solution {
    public static int B = 2;
    public static int A = 5;
    public static int D = B * A;
    public int C = A * B;

    public static void main(String[] args) {
    }

    public  int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}
