package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        compareNumbers(a, b, c);
    }

    private static void compareNumbers(int a, int b, int c) {
        if (a > b && b > c)
            System.out.println(a + " " + b + " " + c);
        if (a > c && c > b)
            System.out.println(a + " " + c + " " + b);
        if (b > a && a > c)
            System.out.println(b + " " + a + " " + c);
        if (b > c && c > a)
            System.out.println(b + " " + c + " " + a);
        if (c > a && a > b)
            System.out.println(c + " " + a + " " + b);
        if (c > b && b > a)
            System.out.println(c + " " + b + " " + a);
    }
}
