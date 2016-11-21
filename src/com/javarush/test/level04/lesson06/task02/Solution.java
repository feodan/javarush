package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        compareNumbers(a, b, c, d);
    }

    private static void compareNumbers(int a, int b, int c, int d) {
        int min = a;
        if (b > min) {
            min = b;
        }
        if (c > min) {
            min = c;
        }
        if (d > min) {
            min = d;
        }
        System.out.println(min);
    }
}
