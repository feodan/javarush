package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        compareNumbers(a, b);
    }

    private static void compareNumbers(int a, int b) {
        if (a > b)
            System.out.println(b);
        else
            System.out.println(a);
    }
}