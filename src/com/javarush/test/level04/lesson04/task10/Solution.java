package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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
        if (a == b && a == c)
            System.out.println(a + " " + b + " " + c);
        else if (a == c)
            System.out.println(a + " " + c);
        else if (c == b)
            System.out.println(b + " " + c);
        else if (a == b)
            System.out.println(a + " " + b);

    }
}